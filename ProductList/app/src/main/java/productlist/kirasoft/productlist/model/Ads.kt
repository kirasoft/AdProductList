package productlist.kirasoft.productlist.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Created by dakotajustin on 11/29/16.
 */

@Root(name= "ads")
public class Ads {

    @field:ElementList(inline = true, entry = "ad") var ad: List<ad>? = null

    @field:Element(required = false) var xmlns: String? = null

    @field:Element var totalCampaignsRequested: String? = null

    @field:Element var serverId: String? = null

    @field: Element var responseTime: String? = null

    @field: Element var version: String? = null

    override fun toString(): String {
        return "ClassPojo [ad = $ad]"
    }
}