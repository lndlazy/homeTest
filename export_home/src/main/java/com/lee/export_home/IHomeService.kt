package com.lee.export_home

import com.alibaba.android.arouter.facade.template.IProvider
import com.lee.export_home.bean.HomeShowBean

interface IHomeService : IProvider {

    //获取首页显示的内容
    fun getHomeShowInfo(): HomeShowBean

}