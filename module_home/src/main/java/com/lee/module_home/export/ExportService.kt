package com.lee.module_home.export

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.lee.export_home.IHomeService
import com.lee.export_home.bean.HomeShowBean
import com.lee.export_home.util.HOME_PAGE_SERVICE

@Route(path = HOME_PAGE_SERVICE)
class ExportService : IHomeService {

    override fun getHomeShowInfo(): HomeShowBean {

        val homeShowBean = HomeShowBean()
        homeShowBean.name = "爱玛欣果电动车~~"
        homeShowBean.type = "电动车"
        return homeShowBean
    }

    override fun init(context: Context?) {
        //初始化的时候调用
    }
}