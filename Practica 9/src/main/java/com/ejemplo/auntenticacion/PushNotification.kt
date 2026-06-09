package com.ejemplo.auntenticacion

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class PushNotification : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        super.onNewToken(token)

        Log.d("FCM_TOKEN", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        Log.d("FCM_MENSAJE", "Mensaje recibido")

        message.notification?.let {
            Log.d("FCM_TITULO", it.title ?: "")
            Log.d("FCM_CUERPO", it.body ?: "")
        }
    }
}