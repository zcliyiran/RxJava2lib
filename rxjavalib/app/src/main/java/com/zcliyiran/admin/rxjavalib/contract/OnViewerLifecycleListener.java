package com.zcliyiran.admin.rxjavalib.contract;

/**
 * View层简单生命周期的绑定
 * <p>
 * 如Controller层,需要把自身与Viewer层的生命周期进行绑定,来对一些事件进行派发
 * <p>
 * Date: 12/22/17.
 *
 * @author 甘罗
 */
public interface OnViewerLifecycleListener extends OnViewerDestroyListener {
    /**
     * Viewer resume 时的回调
     */
    void onViewerResume();

    /**
     * Viewer pause 时的回调
     */
    void onViewerPause();
}
