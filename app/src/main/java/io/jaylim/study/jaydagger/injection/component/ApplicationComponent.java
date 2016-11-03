package io.jaylim.study.jaydagger.injection.component;

import dagger.Component;
import io.jaylim.study.jaydagger.injection.module.ApplicationModule;
import io.jaylim.study.jaydagger.injection.scope.PerApplication;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerApplication
@Component(modules= ApplicationModule.class)
public interface ApplicationComponent {

    /* Subcomponent */

    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */
}
