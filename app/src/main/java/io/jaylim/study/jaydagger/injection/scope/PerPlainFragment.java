package io.jaylim.study.jaydagger.injection.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by jaylim on 11/3/2016.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerPlainFragment {
}
