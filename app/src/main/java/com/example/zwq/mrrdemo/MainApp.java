package com.example.zwq.mrrdemo;

import android.app.Application;

/**
 * @ClassName :    MainApp
 * @Describe :     全局类
 * @Author :       ZWQ
 * @Time :        2017/4/5  15:49
 */
public class MainApp extends Application {

    private static MainApp instance;/**单例全局类*/

    /**
     * Methiod:         getInstance
     * Description:     获取实体类
     * Author:          ZWQ
     * Date:            2017/4/5 15:53
     */
    public static MainApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (instance == null) {
            instance = this;
        }
    }
}
