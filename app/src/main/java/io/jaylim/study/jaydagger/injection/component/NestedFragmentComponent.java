package io.jaylim.study.jaydagger.injection.component;

import dagger.Subcomponent;
import io.jaylim.study.jaydagger.injection.module.NestedFragmentModule;
import io.jaylim.study.jaydagger.injection.scope.PerNestedFragment;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerNestedFragment
@Subcomponent(modules = NestedFragmentModule.class)
public interface NestedFragmentComponent {

    /* Subcomponent */

    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */

}
