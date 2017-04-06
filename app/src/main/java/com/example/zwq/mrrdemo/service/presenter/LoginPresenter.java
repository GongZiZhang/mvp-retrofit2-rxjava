package com.example.zwq.mrrdemo.service.presenter;

import android.content.Context;

import com.example.zwq.mrrdemo.base.BaseMvpPresenter;
import com.example.zwq.mrrdemo.service.DataManager;
import com.example.zwq.mrrdemo.service.bean.BookBean;
import com.example.zwq.mrrdemo.service.bean.UserBean;
import com.example.zwq.mrrdemo.service.contract.LoginContract;

import java.util.Map;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * @ClassName :    com.example.zwq.mrrdemo.service.presenter
 * @Describe :     一句话描述
 * @Author :       ZWQ
 * @Time :       2017/4/5 17:00
 */

public class LoginPresenter extends BaseMvpPresenter<LoginContract.View> implements LoginContract.Presenter {

    private Context context;
    private LoginContract.View loginView;
    private DataManager manager;
    private CompositeSubscription mCompositeSubscription;//统一管理retrofit请求
    private UserBean mUserBean;
    private BookBean mBookBean;


    public LoginPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void initData() {
        loginView = getMvpView();//获取关联view类
        manager = new DataManager(context);
        mCompositeSubscription = new CompositeSubscription();
    }

    @Override
    public void loginNet(Map loginMap) {
        mCompositeSubscription.add(manager.login(loginMap)
                .subscribeOn(Schedulers.io())//网络连接放在子线程
                .observeOn(AndroidSchedulers.mainThread())//加载成功后的操作放在主线程
                .subscribe(new Observer<UserBean>() {
                    @Override
                    public void onCompleted() {
                        if (mUserBean != null) {
                            loginView.onLoginSuccess(mUserBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        loginView.onError(e.toString());
                    }

                    @Override
                    public void onNext(UserBean userBean) {
                        mUserBean = userBean;
                    }
                })
        );
    }

    @Override
    public void getBook(int dev) {
        mCompositeSubscription.add(manager.getBook(dev)
                .subscribeOn(Schedulers.io())//网络连接放在子线程
                .observeOn(AndroidSchedulers.mainThread())//加载成功后的操作放在主线程
                .subscribe(new Observer<BookBean>() {
                    @Override
                    public void onCompleted() {
                        if (mBookBean != null) {
                            loginView.onBookSuccess(mBookBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        loginView.onError(e.toString());
                    }

                    @Override
                    public void onNext(BookBean bookBean) {
                        mBookBean = bookBean;
                    }
                })
        );
    }

    /**
     * Description:     当界面销毁时，要取消网络连接，否则在一些有控件操作的时候会崩溃
     * Author:          ZWQ
     * Date:            2017/4/5 17:23
     */
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }
}
