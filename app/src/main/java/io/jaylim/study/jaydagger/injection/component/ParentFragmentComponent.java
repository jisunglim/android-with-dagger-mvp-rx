package io.jaylim.study.jaydagger.injection.component;

import dagger.Subcomponent;
import io.jaylim.study.jaydagger.injection.module.NestedFragmentModule;
import io.jaylim.study.jaydagger.injection.module.ParentFragmentModule;
import io.jaylim.study.jaydagger.injection.scope.PerParentFragment;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerParentFragment
@Subcomponent(modules = ParentFragmentModule.class)
public interface ParentFragmentComponent {

    /* Subcomponent */
    NestedFragmentComponent plus(NestedFragmentModule nestedFragmentModule);

    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */

}
