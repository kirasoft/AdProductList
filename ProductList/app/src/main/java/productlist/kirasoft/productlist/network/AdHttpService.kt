package productlist.kirasoft.productlist.network

import android.util.Log
import productlist.kirasoft.productlist.model.Ad
import productlist.kirasoft.productlist.model.AdResponse
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by dakotajustin on 11/29/16.
 */
object AdHttpService {

    private val http = AdRetrofit().createRetrofitService(AdHttpInterface::class.java)

    private val TAG = "HttpService"

    fun getAdStream() : List<Ad> {
        val adId = 136
        val password = "OVUJ1DJN"
        val siteId = 4288
        val deviceId = 4230
        val sessionId = "techtestsession"
        val totalCampaignsRequested = 10

        var isWaiting = true

        val list = mutableListOf<Ad>()

        http.adStream(adId, password = password,siteId = siteId,
                deviceId = deviceId, sessionId = sessionId, totalCampaignsRequested = totalCampaignsRequested)
                .observeOn(Schedulers.newThread())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Subscriber<AdResponse>(){
                    override fun onError(e: Throwable?) {
                        if(e != null) {
                            Log.e(TAG, "Problem getting ad stream", e)
                        }
                    }

                    override fun onNext(t: AdResponse?) {
                        if(t?.ads?.ads != null) {
                            val ads = t!!.ads!!.ads
                            list.addAll(ads!!.toList())
                        }
                    }

                    override fun onCompleted() {
                         isWaiting = false
                    }

                })

        while(isWaiting){
            Thread.sleep(1)
        }

        return list
    }


}