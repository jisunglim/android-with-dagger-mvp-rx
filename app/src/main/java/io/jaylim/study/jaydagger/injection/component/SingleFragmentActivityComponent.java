package io.jaylim.study.jaydagger.injection.component;

import dagger.Subcomponent;
import io.jaylim.study.jaydagger.injection.module.ParentFragmentModule;
import io.jaylim.study.jaydagger.injection.module.PlainFragmentModule;
import io.jaylim.study.jaydagger.injection.module.SingleFragmentActivityModule;
import io.jaylim.study.jaydagger.injection.scope.PerSingleFragmentActivity;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerSingleFragmentActivity
@Subcomponent(modules = SingleFragmentActivityModule.class)
public interface SingleFragmentActivityComponent {

    /* Subcomponent */
    PlainFragmentComponent plus(PlainFragmentModule plainFragmentModule);
    ParentFragmentComponent plus(ParentFragmentModule parentFragmentModule);

    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */

}
