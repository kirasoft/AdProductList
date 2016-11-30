package productlist.kirasoft.productlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import productlist.kirasoft.productlist.adapter.AdAdapter
import productlist.kirasoft.productlist.model.Ad
import productlist.kirasoft.productlist.network.AdHttpInterface
import productlist.kirasoft.productlist.network.AdRetrofit
import java.util.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MAIN"

    private var list: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.list) as ListView

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


            doAsync {
               val adresponse = adcall.execute().body()
                val adAdapter = AdAdapter(this@MainActivity, adresponse!!.ads!!.ads!! as ArrayList<Ad>))
                uiThread {
                    adAdapter.notifyDataSetChanged()
                    list!!.adapter = adAdapter
                }
            }



        } catch (e: Exception) {
            Log.e(TAG, "error", e)
        }

    }

}
