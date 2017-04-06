package com.example.zwq.mrrdemo.service;

import android.content.Context;

import com.example.zwq.mrrdemo.service.bean.BookBean;
import com.example.zwq.mrrdemo.service.bean.UserBean;

import java.util.Map;

import rx.Observable;

/**
 * @ClassName :    DataManager
 * @Describe :     代理模式，通过dataManger类获取retrofitserice并调用相应网络访问操作
 * @Author :       ZWQ
 * @Time :        2017/4/5  16:30
 */
public class DataManager {
    private RetrofitService mRetrofitService;

    public DataManager(Context context) {
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
    public Observable<UserBean> login(Map<String, String> loginMap) {
        return mRetrofitService.login(loginMap);
    }

    public Observable<BookBean> getBook(int dev) {
        return mRetrofitService.getBook(dev);
    }
}
