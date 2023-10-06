package com.auto.launcher

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import com.auto.launcher.base.BaseActivity
import com.auto.launcher.databinding.ActivityMainBinding
import com.auto.launcher.utils.DateUtils
import java.util.Date

/**
 * MainActivity
 * Created by wangzhen on 2023/9/8
 */
class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handler.sendEmptyMessage(MSG_TIME_TICK)
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeMessages(MSG_TIME_TICK)
    }

    private val handler = object : Handler(Looper.getMainLooper()) {
        override fun handleMessage(msg: Message) {
            binding.tvTime.text = DateUtils.format(Date(), "HH:mm")
            sendEmptyMessageDelayed(MSG_TIME_TICK, 1000)
        }
    }

    companion object {
        const val MSG_TIME_TICK = 0x01
    }
}