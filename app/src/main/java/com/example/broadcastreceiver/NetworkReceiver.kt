package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class NetworkReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        if(isNetworkConnected(context)){

            Toast.makeText(context,"mang duoc ket noi", Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(context,"mang da bi ngat ket noi", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isNetworkConnected(context: Context?): Boolean {
        val connectivityManager = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo =  connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected

    }

}