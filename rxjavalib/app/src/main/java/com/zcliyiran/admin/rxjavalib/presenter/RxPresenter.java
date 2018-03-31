package com.zcliyiran.admin.rxjavalib.presenter;


import io.reactivex.disposables.Disposable;

/**
 * 支持RxJava的Presenter
 * <p>
 * @author zcliyiran
 */
public interface RxPresenter extends Presenter {
    /**
     * 使用RxJava订阅一个Observable时,需要调用该方法缓存本次订阅
     */
    void attachDisposable(Disposable disposable);

    /**
     * 可以在订阅者 completed 时调用该方法移除掉缓存中的订阅
     */
    void detachDisposable(Disposable disposable);

}
