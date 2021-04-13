package com.dcdhameliya.exampleadmobnativetemplates

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dcdhameliya.admobnativetemplates.AdmobNativeAdTemplateStyle
import com.dcdhameliya.admobnativetemplates.AdmobNativeAdView
import com.google.android.gms.ads.AdLoader
import com.google.android.gms.ads.AdRequest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val builder =
            AdLoader.Builder(this@MainActivity, "ca-app-pub-3940256099942544/2247696110")
                .forNativeAd { nativeAd ->
                    val styles = AdmobNativeAdTemplateStyle.Builder().build()
                    val admobNativeAd: AdmobNativeAdView = findViewById(R.id.my_template)
                    admobNativeAd.setStyles(styles)
                    admobNativeAd.setNativeAd(nativeAd)
                }
        val adLoader: AdLoader = builder.build()
        adLoader.loadAd(AdRequest.Builder().build())
    }
}