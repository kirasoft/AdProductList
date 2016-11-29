package productlist.kirasoft.productlist.model

/**
 * Created by dakotajustin on 11/29/16.
 */
class Ads {
    var totalCampaignsRequested: String? = null

    var ad: Array<Ad>? = null

    var xmlns: String? = null

    var serverId: String? = null

    var responseTime: String? = null

    var version: String? = null

    override fun toString(): String {
        return "ClassPojo [totalCampaignsRequested = $totalCampaignsRequested, ad = $ad, xmlns = $xmlns, serverId = $serverId, responseTime = $responseTime, version = $version]"
    }
}
