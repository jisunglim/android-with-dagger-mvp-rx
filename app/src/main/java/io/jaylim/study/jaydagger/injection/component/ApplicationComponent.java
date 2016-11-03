package io.jaylim.study.jaydagger.injection.component;

import android.app.Application;
import android.content.Context;

import dagger.Component;
import io.jaylim.study.jaydagger.injection.module.ApplicationModule;
import io.jaylim.study.jaydagger.injection.qualifier.ApplicationContext;
import io.jaylim.study.jaydagger.injection.scope.PerApplication;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerApplication
@Component(modules= ApplicationModule.class)
public interface ApplicationComponent {

    /* Subcomponent */
    // FINAL

    /* Dependencies extended by constructor injections */
    // TODO

    /* Dependencies provided from modules */
    @ApplicationContext Context context();
    Application application();
    // TODO

    /* Field injection */
    // FINAL
}
