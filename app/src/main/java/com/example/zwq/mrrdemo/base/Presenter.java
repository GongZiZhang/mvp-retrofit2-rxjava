package com.example.zwq.mrrdemo.base;

/**
 * @ClassName :    Presenter
 * @Describe :     基类presenter
 * @Author :       ZWQ
 * @Time :        2017/4/5  15:40
 */
public interface Presenter<T extends BaseMvpView> {

    /**
     * presenter和对应的view绑定
     *
     * @param mvpView 目标view
     */
    void attachView(T mvpView);

    /**
     * presenter与view解绑
     */
    void detachView();
}
