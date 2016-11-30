package productlist.kirasoft.productlist.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Created by dakotajustin on 11/29/16.
 *
 * generic static class for retrofit construction
 */
class AdRetrofit {

    private val BASEURL = "http://ads.appia.com/"

    //generic retrofit service creator
    //this is a pattern I love to follow in many of my apps
     fun <T> createRetrofitService(clazz: Class<T>): T {

        val okhttp = OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .build()

        val restAdapter = Retrofit.Builder()
                .baseUrl(BASEURL)
                .client(okhttp)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build()
        val service = restAdapter.create(clazz)

        return service
    }
}