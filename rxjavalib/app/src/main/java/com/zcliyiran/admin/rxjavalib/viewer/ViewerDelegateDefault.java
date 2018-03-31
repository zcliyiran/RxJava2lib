package com.zcliyiran.admin.rxjavalib.viewer;


import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.zcliyiran.admin.rxjavalib.R;


/**
 * 真正的Viewer的委托的默认实现，子类可以自己自定义
 * 这里处理大部分Viewer层与Controller/Presenter层的绑定和回调
 * <p>
 *
 * @author zcliyiran
 */
public class ViewerDelegateDefault extends ViewerAbstractDelegate {

    private Toast toast;
    private LoadingDialog loadingDialog;

    public ViewerDelegateDefault(Context context) {
        super(context);
    }

    @Override
    public void showToast(String message) {
        if (!checkViewer()) {
            return;
        }
        if (null == toast) {
            toast = Toast.makeText(mContextRef.get(), "", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
        }
        toast.setText(message);
        toast.show();
    }

    @Override
    public void showLoadingDialog(String message) {
        if (!checkViewer()) {
            return;
        }

        if (null == loadingDialog) {
            loadingDialog = new LoadingDialog(mContextRef.get(), R.style.CustomProgressDialog);
            loadingDialog.setCanceledOnTouchOutside(false);
        }
        loadingDialog.show();
        loadingDialog.setMessage(message);
    }

    @Override
    public void cancelLoadingDialog() {
        if (!checkViewer()) {
            return;
        }
        if (null != loadingDialog) {
            loadingDialog.cancel();
        }
    }

    public void toastNormalShort(String message) {

        ToastUtil.showShort(mContextRef.get(), message);

    }
    public void toastNormalShort(int message) {

        ToastUtil.showShort(mContextRef.get(), message);

    }

    public void toastNormalLong(String message) {

        ToastUtil.showLong(mContextRef.get(), message);

    }

    public void toastNormalLong(int message) {

        ToastUtil.showLong(mContextRef.get(), message);

    }
}