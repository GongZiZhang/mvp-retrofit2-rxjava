package com.example.zwq.mrrdemo.service;


import com.example.zwq.mrrdemo.service.bean.BookBean;
import com.example.zwq.mrrdemo.service.bean.UserBean;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @ClassName :    RetrofitService
 * @Describe :     Retrofit接口访问服务类
 * @Author :       ZWQ
 * @Time :        2017/4/5  16:14
 */
public interface RetrofitService {
    /**
     * Description:     post登录
     * Author:          ZWQ
     * Date:            2017/4/5 16:29
     */
    @FormUrlEncoded//使用了field 和fieldMap注解后，一定要加这个，不然会报错
    @POST("这里为登录接口")//找了很久都没在网上找到开放的登录接口，所以大家想测试登录，只要换上自己项目的登录接口便可
    Observable<UserBean> login(@FieldMap Map<String, String> loginMap);


    @GET("article/today")
    Observable<BookBean> getBook(@Query("dev") int dev);

}
