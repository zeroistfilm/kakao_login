package com.example.picphologin

import android.app.Application
import com.kakao.sdk.common.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //{네이티브 앱키}
        KakaoSdk.init(this, "2334745a95a227aed16aeb20782f4d30")
    }
}