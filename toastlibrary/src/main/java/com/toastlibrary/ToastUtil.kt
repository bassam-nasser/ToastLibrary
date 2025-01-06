package com.toastlibrary

import android.content.Context
import android.widget.Toast

object ToastUtil {
    fun showToast(
        context: Context,
        message: String,
        isLong: Boolean = false
    ) {
        val toast = Toast.makeText(
            context,
            message,
            if (isLong) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
        )
        toast.show()
    }
}