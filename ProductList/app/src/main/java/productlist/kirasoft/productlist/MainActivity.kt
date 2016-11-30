package productlist.kirasoft.productlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ListView
import org.jetbrains.anko.doAsync
import productlist.kirasoft.productlist.adapter.ProductAdapter
import productlist.kirasoft.productlist.model.Ads
import productlist.kirasoft.productlist.network.AdHttpInterface
import productlist.kirasoft.productlist.network.AdRetrofit
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private val TAG = "MAIN"

    private var list: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.list) as ListView

         try {
            val retrofit = AdRetrofit().createRetrofitService(AdHttpInterface::class.java)
            val adcall = retrofit.adStream()

             doAsync {
                 adcall.enqueue(object : retrofit2.Callback<Ads> {
                     override fun onFailure(call: Call<Ads>, t: Throwable?) {
                         if (t != null) Log.e(TAG, "failed ad call", t)
                     }

                     override fun onResponse(call: Call<Ads>, response: Response<Ads>?) {
                         Log.d(TAG, "I got a response: " + response?.body().toString())
                         val adAdapter = ProductAdapter(this@MainActivity, ads = response!!.body().ad!!.toList())

                         adAdapter.notifyDataSetChanged()
                         list!!.adapter = adAdapter

                     }

                 })

             }
        } catch (e: Exception) {
            Log.e(TAG, "error", e)
        }

    }

}
