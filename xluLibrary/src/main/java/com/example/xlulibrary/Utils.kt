package com.example.xlulibrary

import android.R
import android.view.Gravity
import android.view.View
import android.widget.TextView

/**
 * @ClassName Utils
 * @Description TODO
 * @Author AlexLu_1406496344@qq.com
 * @Date 2021/6/18 16:20
 */

fun getLocaGravity(location: Location): Int {
    return when(location){
        Location.TOP -> {
            Gravity.TOP
        }
        Location.CENTER -> {
            Gravity.CENTER
        }
        Location.BOTTOM -> {
            Gravity.BOTTOM
        }
    }
}


/**
 * 智能获取用于显示消息的 TextView
 */
fun findMessageView(view: View): TextView {
    if (view is TextView) {
        if (view.getId() == View.NO_ID) {
            view.setId(R.id.message)
        } else require(view.getId() == R.id.message) {
            // 必须将 TextView 的 id 值设置成 android.R.id.message
            "You must set the ID value of TextView to android.R.id.message"
        }
        return view
    }
    if (view.findViewById<View>(R.id.message) is TextView) {
        return view.findViewById<View>(R.id.message) as TextView
    }
    throw IllegalArgumentException("You must include a TextView with an ID value of android.R.id.message")
}
