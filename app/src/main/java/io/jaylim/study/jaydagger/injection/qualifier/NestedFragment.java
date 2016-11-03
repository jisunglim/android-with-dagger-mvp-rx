package io.jaylim.study.jaydagger.injection.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by jaylim on 11/3/2016.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface NestedFragment {
}
