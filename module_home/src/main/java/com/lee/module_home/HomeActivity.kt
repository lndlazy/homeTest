package com.lee.module_home

import android.widget.Button
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.lee.commontest.base.BaseActivity

@Route(path = "/home/homeActivity")
class HomeActivity : BaseActivity() {

    override fun getViewId(): Int = R.layout.activity_home

    override fun initData() {
        val stringExtra = intent?.getStringExtra("str")
        val intExtra = intent?.getIntExtra("int", -1)
        val booleanExtra = intent?.getBooleanExtra("boolean", false)
        println("HomeActivity ==>>> str:$stringExtra, intExtra:${intExtra}, booleanExtra:$booleanExtra")

    }

    override fun initView() {
        findViewById<Button>(R.id.btn).setOnClickListener {
            //cart跳转到首页
            ARouter.getInstance().build("/cart/cartActivity")
                .withString("str", "homeActivity跳转过来的")
                .withInt("int", 666)
                .withBoolean("boolean", true)
                .navigation()
        }
    }


}