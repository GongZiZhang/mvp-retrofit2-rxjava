package com.example.zwq.mrrdemo.service;

import android.content.Context;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @ClassName :    RetrofitHelper
 * @Describe :     retrofit帮助类
 * @Author :       ZWQ
 * @Time :        2017/4/5  16:08
 */
public class RetrofitHelper {

    private Context mCntext;

    OkHttpClient client = new OkHttpClient();
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
    /**
     * 支持gson
     **/
    private static RetrofitHelper instance = null;
    private Retrofit mRetrofit = null;

    /**
     * Description:     retrofit单例
     * Author:          ZWQ
     * Date:            2017/4/5 16:08
     */
    public static RetrofitHelper getInstance(Context context) {
        if (instance == null) {
            instance = new RetrofitHelper(context);
        }
        return instance;
    }

    private RetrofitHelper(Context mContext) {
        mCntext = mContext;
        init();
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl("https://interface.meiriyiwen.com/")//这里为获取文章的基础接口
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public RetrofitService getServer() {
        return mRetrofit.create(RetrofitService.class);
    }
}
