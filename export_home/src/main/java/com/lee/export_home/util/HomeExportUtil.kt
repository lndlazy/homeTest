package com.lee.export_home.util

import com.alibaba.android.arouter.launcher.ARouter
import com.lee.export_home.IHomeService
import com.lee.export_home.bean.HomeShowBean

class HomeExportUtil private constructor() {

    companion object {

        val INSTANCE by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            HomeExportUtil()
        }

    }

    private fun getService(): IHomeService {
        return ARouter.getInstance().build(HOME_PAGE_SERVICE).navigation() as IHomeService
    }

    fun getHomeShowInfo(): HomeShowBean {
        return getService().getHomeShowInfo()
    }

}