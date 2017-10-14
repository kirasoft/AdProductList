package productlist.kirasoft.productlist.network

import productlist.kirasoft.productlist.model.Ads
import retrofit2.Call
import retrofit2.http.GET


/**
 * Created by dakotajustin on 11/28/16.
 */
interface AdHttpInterface {

    @GET("getAds")
    fun adStream(@Query id: String, @Query password: String, @Query deviceId: String): Call<Ads>

}
