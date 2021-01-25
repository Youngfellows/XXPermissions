package com.neandroid.xxpermissions;

import android.app.Application;

import com.hjq.permissions.XXPermissions;
import com.hjq.toast.ToastUtils;
import com.hjq.toast.style.ToastWhiteStyle;


public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化吐司工具类
        ToastUtils.init(this, new ToastWhiteStyle(getApplicationContext()));

        // 设置权限申请拦截器
        XXPermissions.setPermissionInterceptor(new PermissionInterceptor());
    }
}