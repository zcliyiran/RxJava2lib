package com.zcliyiran.admin.rxjavalib.viewer;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.zcliyiran.admin.rxjavalib.R;


/**
 * @author zcliyiran
 * @date 2018/3/30.
 */
public class LoadingDialog extends AlertDialog {

    private TextView tvMsg;


    private ImageView imageView;


    public LoadingDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.progress_loading);
        tvMsg = findViewById(R.id.tvMsg);
        imageView = findViewById(R.id.ivLoading);

    }


    @Override
    public void setMessage(CharSequence message) {
        AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
        tvMsg.setText(message);
    }


}
