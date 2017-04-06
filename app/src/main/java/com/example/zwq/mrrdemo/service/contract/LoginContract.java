package com.example.zwq.mrrdemo.service.contract;

import com.example.zwq.mrrdemo.base.BaseMvpView;
import com.example.zwq.mrrdemo.service.bean.BookBean;
import com.example.zwq.mrrdemo.service.bean.UserBean;

import java.util.Map;

/**
 * @ClassName :    com.example.zwq.mrrdemo.service.contract
 * @Describe :     登录契约类,方便查看相应界面的所有操作，方便单元测试
 * @Author :       ZWQ
 * @Time :       2017/4/5 17:04
 */

public class LoginContract {

    public interface Presenter {
        void initData();

        void loginNet(Map loginMap);//登录

        void getBook(int dev);//获取文章数据
    }

    public interface View extends BaseMvpView {
        void onLoginSuccess(UserBean ub);

        void onBookSuccess(BookBean bb);

        void onError(String result);
    }
}
