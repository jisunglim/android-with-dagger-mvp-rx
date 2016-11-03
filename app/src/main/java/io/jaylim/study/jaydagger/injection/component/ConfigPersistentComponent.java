package io.jaylim.study.jaydagger.injection.component;

import dagger.Component;
import io.jaylim.study.jaydagger.injection.module.PlainActivityModule;
import io.jaylim.study.jaydagger.injection.module.SingleFragmentActivityModule;
import io.jaylim.study.jaydagger.injection.scope.PerConfigPersistent;

/**
 * Created by jaylim on 11/3/2016.
 */

@PerConfigPersistent
@Component(dependencies = ApplicationComponent.class)
public interface ConfigPersistentComponent {

    /* Subcomponent */
    PlainActivityComponent plus(PlainActivityModule plainActivityModule);
    SingleFragmentActivityComponent plus(SingleFragmentActivityModule singleFragmentActivityModule);

    /* Dependencies extended by constructor injections */

    /* Dependencies provided from modules */

    /* Field injection */
}
