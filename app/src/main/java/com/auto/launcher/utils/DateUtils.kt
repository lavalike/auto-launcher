package com.auto.launcher.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * DateUtils
 * Created by wangzhen on 2023/10/6
 */
object DateUtils {
    fun format(date: Date, format: String): String =
        SimpleDateFormat(format, Locale.getDefault()).format(date)
}