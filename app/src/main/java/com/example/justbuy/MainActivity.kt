package com.example.justbuy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity // 导入 AppCompatActivity 作为 Activity 的基类

// MainActivity 现在继承自 AppCompatActivity，这是传统的 View 系统中常用的 Activity 基类
class MainActivity : AppCompatActivity() {

    // onCreate 是 Activity 的生命周期方法，在 Activity 创建时调用
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 设置 Activity 的内容视图为之前创建的 XML 布局文件
        setContentView(R.layout.activity_main)

    }
}

