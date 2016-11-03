package io.jaylim.study.jaydagger.injection.component;

import dagger.Subcomponent;
import io.jaylim.study.jaydagger.injection.module.PlainFragmentModule;
import io.jaylim.study.jaydagger.injection.scope.PerPlainFragment;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerPlainFragment
@Subcomponent(modules = PlainFragmentModule.class)
public interface PlainFragmentComponent {

    /* Subcomponent */

    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */

}
