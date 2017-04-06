package com.example.zwq.mrrdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @ClassName :    BaseMvpActivity
 * @Describe :     activity基类
 * @Author :       ZWQ
 * @Time :        2017/4/5  15:55
 */
public abstract class BaseMvpActivity extends AppCompatActivity implements BaseMvpView {

    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        bind = ButterKnife.bind(this);//使用butterKnife生成控件实体
        initEventAndData();
    }

    /**
     * Description:     获取布局文件id
     * Author:          ZWQ
     * Date:            2017/4/5 16:06
     */
    protected abstract int getLayoutId();

    /**
     * Description:     初始化
     * Author:          ZWQ
     * Date:            2017/4/5 16:06
     */
    protected abstract void initEventAndData();

    @Override
    protected void onDestroy() {
        if (bind != null) {
            bind.unbind();//解绑控件
        }
        super.onDestroy();
    }
}
