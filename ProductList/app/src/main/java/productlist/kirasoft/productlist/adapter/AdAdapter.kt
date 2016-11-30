package productlist.kirasoft.productlist.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import productlist.kirasoft.productlist.model.Ad
import java.util.*

/**
 * Created by dakotajustin on 11/29/16.
 */
class AdAdapter(context: Context, ads: ArrayList<Ad>) : ArrayAdapter<Ad>(context, 0, ads)  {



    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getView(position, convertView, parent)
    }


}