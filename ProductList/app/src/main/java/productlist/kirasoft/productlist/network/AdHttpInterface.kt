package productlist.kirasoft.productlist.network

import productlist.kirasoft.productlist.model.AdResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by dakotajustin on 11/28/16.
 */
interface AdHttpInterface {

    @GET("http://ads.appia.com/getAds?id=adId}&password={password}&siteId={siteId}&" +
            "deviceId={deviceId}&sessionId={sessionId}&" +
            "totalCampaignsRequested={totalCampaignsRequested}")
    fun adStream(@Path("id") adId: Int, @Path("siteId") siteId: Int, @Path("deviceId") deviceId: Int,
                 @Path("password") password: String, @Path("sessionId") sessionId: String,
                 @Path("totalCampaignsRequested") totalCampaignsRequested: Int): Call<AdResponse>

}
