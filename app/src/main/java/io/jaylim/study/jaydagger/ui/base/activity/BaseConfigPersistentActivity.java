package io.jaylim.study.jaydagger.ui.base.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.util.LongSparseArray;
import android.support.v7.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicLong;

import io.jaylim.study.jaydagger.MyDaggerApplication;
import io.jaylim.study.jaydagger.injection.component.ApplicationComponent;
import io.jaylim.study.jaydagger.injection.component.ConfigPersistentComponent;
import io.jaylim.study.jaydagger.injection.component.DaggerConfigPersistentComponent;

/**
 * Created by jaylim on 11/4/2016.
 */

public class BaseConfigPersistentActivity extends AppCompatActivity {

    /* KV pair : ACTIVITY_ID -> mActivityId -> mActivityComponent */
    private static final String KEY_ACTIVITY_ID = "KEY_ACTIVITY_ID";
    private long mActivityId;
    private ConfigPersistentComponent mConfigPersistentComponent;

    /* Key storage */
    private static final LongSparseArray<ConfigPersistentComponent> sComponentMap = new LongSparseArray<>();

    /* Key generator */
    private static final AtomicLong NEXT_ID = new AtomicLong(0);

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putLong(KEY_ACTIVITY_ID, mActivityId);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        /* get mActivityId with KEY_ACTIVITY_ID or generate new mActivityId from NEXT_ID */
        mActivityId = savedInstanceState != null ?
                savedInstanceState.getLong(KEY_ACTIVITY_ID) : NEXT_ID.getAndIncrement();

        /* get configPersistentActivityComponent with mActivityId
           or generate new configPersistentActivityComponent */
        mConfigPersistentComponent = sComponentMap.get(mActivityId);
        if (mConfigPersistentComponent == null) {
            mConfigPersistentComponent = DaggerConfigPersistentComponent.builder()
                    .applicationComponent(getParentComponent(this))
                    .build();
            sComponentMap.put(mActivityId, mConfigPersistentComponent);
        }
    }

    @Override
    protected void onDestroy() {
        if (!isChangingConfigurations()) {
            sComponentMap.remove(mActivityId);
        }
        super.onDestroy();
    }

    public ConfigPersistentComponent getConfigPersistentComponent() {
        return mConfigPersistentComponent;
    }

    private ApplicationComponent getParentComponent(Context context) {
        return MyDaggerApplication.get(context).getApplicationComponent();
    }
}
