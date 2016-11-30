package productlist.kirasoft.productlist.network

import productlist.kirasoft.productlist.model.AdResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by dakotajustin on 11/28/16.
 */
internal interface AdHttpInterface {


    //private val testStr = "siteId=4288&amp;deviceId=4230&amp;sessionId=techtestsession&amp;totalCampaignsRequested=10"

    @GET("getAds")
    fun adStream(@Query("id") adId: Int, @Query("siteId") siteId: Int, @Query("deviceId") deviceId: Int,
                                   @Query("password") password: String, @Query("sessionId") sessionId: String,
                                   @Query("totalCampaignsRequested") totalCampaignsRequested: Int): Observable<AdResponse>

}
