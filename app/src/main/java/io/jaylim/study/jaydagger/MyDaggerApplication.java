package io.jaylim.study.jaydagger;

import android.app.Application;
import android.content.Context;

import io.jaylim.study.jaydagger.injection.component.ApplicationComponent;
import io.jaylim.study.jaydagger.injection.component.DaggerApplicationComponent;
import io.jaylim.study.jaydagger.injection.module.ApplicationModule;
import timber.log.Timber;

/**
 * Created by jaylim on 11/3/2016.
 */

public class MyDaggerApplication extends Application {

    ApplicationComponent mApplicationComponent;

    public static MyDaggerApplication get(Context context) {
        return (MyDaggerApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }

    public ApplicationComponent getApplicationComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponent.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }
}
