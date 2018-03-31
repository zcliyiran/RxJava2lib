package com.zcliyiran.admin.rxjavalib.contract;

/**
 * Viewer层的销毁回调
 * 如Presenter等需要把自身与Viewer的销毁事件进行绑定
 * 可以在Viewer销毁时做一些额外的处理
 * <p>
 * Date: 12/22/17.
 *
 * @author 甘罗
 */
public interface OnViewerDestroyListener {
    /**
     * Viewer层被销毁时的回调
     */
    void onViewerDestroy();
}
