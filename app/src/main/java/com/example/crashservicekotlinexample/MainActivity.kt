package com.example.crashservicekotlinexample

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.huawei.agconnect.crash.AGConnectCrash


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val crashButton = findViewById<Button>(R.id.btn_crash)
        crashButton.setOnClickListener {
            AGConnectCrash.getInstance().testIt(this)
        }

        val disableCrashCollectionButton = findViewById<View>(R.id.disable_crash_collection)
        disableCrashCollectionButton.setOnClickListener {
            AGConnectCrash.getInstance().enableCrashCollection(false)
        }

        val enableCrashCollectionButton = findViewById<View>(R.id.enable_crash_collection)
        enableCrashCollectionButton.setOnClickListener {
            AGConnectCrash.getInstance().enableCrashCollection(true)
        }
    }
}