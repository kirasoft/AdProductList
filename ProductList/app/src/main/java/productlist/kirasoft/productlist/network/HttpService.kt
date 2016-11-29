package productlist.kirasoft.productlist.network

import productlist.kirasoft.productlist.model.Product
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by dakotajustin on 11/28/16.
 */
interface ProductService {


    //private val testStr = "id=236&amp;password=OVUJ1DJN&amp;siteId=4288&amp;deviceId=4230&amp;sessionId=techtestsession&amp;totalCampaignsRequested=10"




    @GET("getAds")
    abstract fun getProductsReport(@Query("id") productId: String, @Query("deviceId") deviceId: String,
                                   @Query("password") password: String, @Query("sessionId") sessionId: String,
                                   @Query("totalCampaignsRequested") totalCampaignsRequested: Int): Observable<Product>

}
