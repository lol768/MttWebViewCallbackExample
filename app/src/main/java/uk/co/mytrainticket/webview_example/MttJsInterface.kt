package uk.co.mytrainticket.webview_example

import android.app.AlertDialog
import android.util.Log
import android.webkit.JavascriptInterface


class MttJsInterface(private val activity: MainActivity) {

    @JavascriptInterface
    fun paymentSuccess(payloadInJson: String) {
        Log.i("MttJsInterface", "Got callback")
            activity.runOnUiThread {
                AlertDialog.Builder(activity)
                    .setTitle("Callback was hit")
                    .setMessage("The payment was a success! Payload was\n$payloadInJson")
                    .show()
            }
    }

}