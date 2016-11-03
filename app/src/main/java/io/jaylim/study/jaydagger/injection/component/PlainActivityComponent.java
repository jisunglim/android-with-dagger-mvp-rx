package io.jaylim.study.jaydagger.injection.component;

import dagger.Subcomponent;
import io.jaylim.study.jaydagger.injection.module.PlainActivityModule;
import io.jaylim.study.jaydagger.injection.scope.PerPlainActivity;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerPlainActivity
@Subcomponent(modules = PlainActivityModule.class)
public interface PlainActivityComponent {

    /* Subcomponent */


    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */

}
