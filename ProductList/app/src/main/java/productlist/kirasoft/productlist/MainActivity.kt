package productlist.kirasoft.productlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import productlist.kirasoft.productlist.network.AdHttpInterface
import productlist.kirasoft.productlist.network.AdRetrofit

class MainActivity : AppCompatActivity() {

    private val TAG = "MAIN"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            val adId = 136
            val password = "OVUJ1DJN"
            val siteId = 4288
            val deviceId = 4230
            val sessionId = "techtestsession"
            val totalCampaignsRequested = 10


            val retrofit = AdRetrofit().createRetrofitService(AdHttpInterface::class.java)


            val adcall = retrofit.adStream(adId, password = password, siteId = siteId,
                    deviceId = deviceId, sessionId = sessionId, totalCampaignsRequested = totalCampaignsRequested)


        } catch (e: Exception) {
            Log.e(TAG, "error", e)
        }

    }

}
