package com.zcliyiran.admin.mvprxjava.controller;


import com.zcliyiran.admin.mvprxjava.viewer.Viewer;

/**
 * Controller层的默认空实现
 * 即在回调中不做任何处理
 * <p>
 * Date: 12/22/17.
 *
 * @author 李毅然
 */
public class BaseController implements Controller {

    /**
     * 提供View简单生命周期的绑定
     * <p>
     * 该方法还可以让子类重写用于做为Controller的初始化方法,但是注意重写的时候必须要调用super.bind()!
     *
     * @param bindViewer
     */
    @Override
    public void bind(Viewer bindViewer) {
        bindViewer.bind(this);
    }

    @Override
    public void onViewerResume() {
        // ignore
    }

    @Override
    public void onViewerPause() {
        // ignore
    }

    @Override
    public void onViewerDestroy() {
        // ignore
    }
}
