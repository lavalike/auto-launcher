package com.auto.launcher

import android.os.Bundle
import com.auto.launcher.base.BaseActivity
import com.auto.launcher.databinding.ActivityMainBinding

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
    }
}