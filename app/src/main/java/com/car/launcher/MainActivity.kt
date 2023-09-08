package com.car.launcher

import android.os.Bundle
import com.car.launcher.base.BaseActivity
import com.car.launcher.databinding.ActivityMainBinding

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