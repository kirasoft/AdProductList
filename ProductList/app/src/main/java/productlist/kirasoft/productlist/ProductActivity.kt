package productlist.kirasoft.productlist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class ProductActivity : AppCompatActivity() {

    private var productText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_activity)

        val fullText : String = intent.getStringExtra("FULL_TEXT")

        productText = findViewById(R.id.text_ad_full) as TextView
        productText!!.text = fullText


    }



}
