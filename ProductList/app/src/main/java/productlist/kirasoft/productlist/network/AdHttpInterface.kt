package productlist.kirasoft.productlist.network

import productlist.kirasoft.productlist.model.Ads
import retrofit2.Call
import retrofit2.http.GET


/**
 * Created by dakotajustin on 11/28/16.
 */
interface AdHttpInterface {


    //http://ads.appia.com/getAds?id=236&amp;password=OVUJ1DJN&amp;siteId=4288&amp;deviceId=4230&amp;sessionId=techtestsession&amp;totalCampaignsRequested=10

    @GET("getAds?id=236&password=OVUJ1DJN&siteId=4288&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10&lname=Justin")
    fun adStream(): Call<Ads>

}
