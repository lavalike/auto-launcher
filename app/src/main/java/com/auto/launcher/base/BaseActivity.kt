package com.auto.launcher.base

import android.os.Bundle
import com.wangzhen.commons.toolbar.ToolbarActivity

/**
 * BaseActivity
 * Created by wangzhen on 2023/9/8
 */
open class BaseActivity : ToolbarActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}