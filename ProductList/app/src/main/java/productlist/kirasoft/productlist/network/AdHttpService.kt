package productlist.kirasoft.productlist.network

/**
 * Created by dakotajustin on 11/29/16.
 */
object AdHttpService {

    private val http = AdRetrofit().createRetrofitService(AdHttpInterface::class.java)

    private val TAG = "HttpService"


}