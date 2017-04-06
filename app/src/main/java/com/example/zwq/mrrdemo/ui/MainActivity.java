package com.example.zwq.mrrdemo.ui;

import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zwq.mrrdemo.R;
import com.example.zwq.mrrdemo.base.BaseMvpActivity;
import com.example.zwq.mrrdemo.service.bean.BookBean;
import com.example.zwq.mrrdemo.service.bean.UserBean;
import com.example.zwq.mrrdemo.service.contract.LoginContract;
import com.example.zwq.mrrdemo.service.presenter.LoginPresenter;
import com.example.zwq.mrrdemo.util.DES3Utils;

import java.util.HashMap;

import Decoder.BASE64Encoder;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * @ClassName :    MainActivity
 * @Describe :     登录界面
 * @Author :       ZWQ
 * @Time :        2017/4/5  16:57
 */
public class MainActivity extends BaseMvpActivity implements LoginContract.View {

    @BindView(R.id.main_username_et)
    EditText mainUsernameEt;
    @BindView(R.id.main_password_et)
    EditText mainPasswordEt;
    @BindView(R.id.main_login_bt)
    Button mainLoginBt;
    @BindView(R.id.main_getBook_bt)
    Button mainGetBookBt;
    @BindView(R.id.main_user_tv)
    TextView main_user_tv;
    @BindView(R.id.activity_main)
    LinearLayout activityMain;
    private LoginPresenter loginPresenter;

    private final String TAG = "MainActivity";

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initEventAndData() {
        loginPresenter = new LoginPresenter(this);
        loginPresenter.attachView(this);//绑定view跟presenter
        loginPresenter.initData();//初始化数据
    }

    @OnClick({R.id.main_login_bt, R.id.main_getBook_bt})
    public void submit(Button button) {
        switch (button.getId()) {
            case R.id.main_login_bt:
                //点击登录,获取信息后去登录
                /**这里因为涉及到项目的隐私，所以把关键链接参数都替换了，大家若想测试post登录请求，替换成自己项目的登录接口即可*/
                String userName = mainUsernameEt.getText().toString();
                String password = mainPasswordEt.getText().toString();
                HashMap<String, String> hm = new HashMap<>();//拼接参数
                hm.put("参数1", "123");
                hm.put("参数2", "123");
//                hm.put("username", new BASE64Encoder().encode(DES3Utils.encryptMode(userName.getBytes())));
//                hm.put("password", new BASE64Encoder().encode(DES3Utils.encryptMode(password.getBytes())));
                loginPresenter.loginNet(hm);//调用presenter类的登录方法，登录逻辑将给presenter类去处理
                break;
            case R.id.main_getBook_bt:
                loginPresenter.getBook(1);//调用presenter类的获取文章
                break;
        }

    }


    @Override
    protected void onDestroy() {
        loginPresenter.onStop();//界面退出时，要取消网络请求
        super.onDestroy();
    }

    @Override
    public void onLoginSuccess(UserBean ub) {
        main_user_tv.setText(ub.toString());//加载成功后，获取数据进行view操作
    }

    @Override
    public void onBookSuccess(BookBean bb) {
        main_user_tv.setText(bb.toString());//加载成功后，获取数据进行view操作
    }

    @Override
    public void onError(String result) {
        Log.e(TAG, result);
        Toast.makeText(this, result, Toast.LENGTH_SHORT);
    }
}
