package productlist.kirasoft.productlist.view

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.onClick
import productlist.kirasoft.productlist.ProductActivity
import productlist.kirasoft.productlist.R
import productlist.kirasoft.productlist.model.Ad
import java.util.*

/**
 * Created by dakotajustin on 11/29/16.
 */
class ProductListView(context: Context, ads: ArrayList<Ad>) : ArrayAdapter<Ad>(context,0, ads) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var convertView = view
        val viewHolder: ViewHolder?
        val ad = getItem(position)

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.ad_list_layout, null)
            viewHolder = ViewHolder(convertView)
            convertView!!.tag = viewHolder
        } else {
            viewHolder = convertView.tag as ViewHolder
        }

        if (viewHolder != null) {
            populateViewHolder(viewHolder, ad)

            val intent = Intent(context, ProductActivity::class.java)
            intent.putExtra("FULL_TEXT", ad.toString())
            convertView.onClick { 
                context.startActivity(intent)
            }
        }



        return convertView
    }


    fun populateViewHolder(viewHolder: ViewHolder, ad: Ad) {
        viewHolder.adNameTextView.setText(ad.productName)
        viewHolder.adProductRatingTextView.setText(ad.rating)

        Glide
                .with(viewHolder.context)
                .load(ad.productThumbnail)
                .centerCrop()
                .crossFade()
                .into(viewHolder.adImageView);

    }


    class ViewHolder(view: View) {

        //everything but medTextView is optional
        //This adapter is used for suggestion page and med card fragment

        var adNameTextView : TextView
        var adImageView : ImageView
        var adProductRatingTextView : TextView
        var context: Context

        init {
            context = view.context
            adNameTextView = view.findViewById(R.id.text_ad_name) as TextView
            adImageView = view.findViewById(R.id.image_ad) as ImageView
            adProductRatingTextView = view.findViewById(R.id.text_ad_product_rating) as TextView
        }



    }

}