package io.jaylim.study.jaydagger.injection.module;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;
import io.jaylim.study.jaydagger.injection.qualifier.ApplicationContext;

/**
 * Created by jaylim on 11/3/2016.
 */

@Module
public class ApplicationModule {
    private final Application mApplication;

    /** Constructor */
    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    /* System Object Provider */
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Provides @ApplicationContext
    public Context provideContext() {
        return mApplication;
    }
    //FINAL

    /* Service Object Provider */
    // TODO
}
