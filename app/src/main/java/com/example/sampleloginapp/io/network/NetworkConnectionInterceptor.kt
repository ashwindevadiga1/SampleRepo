package com.example.sampleloginapp.io.network

import android.content.Context
import android.net.ConnectivityManager
import com.example.sampleloginapp.utils.INTERNT_CONNECTION
import com.example.sampleloginapp.utils.NoInternetException
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnectionInterceptor(context: Context): Interceptor {

    val applicationContext = context.applicationContext
    override fun intercept(chain: Interceptor.Chain): Response {
        if(!isInternetAvailable())
            throw NoInternetException(INTERNT_CONNECTION)
        return chain.proceed(chain.request())
    }

    private fun isInternetAvailable(): Boolean {

        val connectivityManager: ConnectivityManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
         connectivityManager.activeNetworkInfo.also{
             return it != null && it.isConnected
         }

    }

}