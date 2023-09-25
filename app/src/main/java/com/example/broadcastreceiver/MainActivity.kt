package com.example.broadcastreceiver

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private val myReceiver = NetworkReceiver()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filter = IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")
        registerReceiver(myReceiver,filter)

    }
    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myReceiver)
    }
}