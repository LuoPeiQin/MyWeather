package com.luo.myweather

import android.app.Application
import android.content.Context

class MyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "jJ9xR79=PTdPo7LL"
        lateinit var mContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }

}