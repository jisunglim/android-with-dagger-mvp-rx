package io.jaylim.study.jaydagger.ui.base;

/**
 * Created by jaylim on 11/3/2016.
 */

public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();
}
