package com.example.mad_app102_p7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import androidx.core.view.WindowCompat
import com.example.mad_app102_p7.databinding.ActivityWebviewBinding

class WebviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWebviewBinding
    override fun onCreate (savedInstancestate: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstancestate)

        binding = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initWebVideoPlayer()
        binding.btnSwitch.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

    }
    private val youtubeld = "6stlCkUDG_s"
    private fun initWebVideoPlayer(){
        val webSettings: WebSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.webView.loadUrl("https://www.youtube.com/embed/$youtubeld")

    }
}