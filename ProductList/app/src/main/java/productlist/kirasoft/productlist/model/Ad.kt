package productlist.kirasoft.productlist.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Created by dakotajustin on 11/29/16.
 */
@Root(name="ad")
public class ad {
    @field:Element
    var campaignId: String? = null

    @field:Element
    var appId: String? = null

    @field:Element
    var campaignTypeId: String? = null

    @field:Element
    var productDescription: String? = null

    @field:Element
    var productId: String? = null

    @field:Element
    var isRandomPick: String? = null

    @field:Element
    var callToAction: String? = null

    @field:Element
    var categoryName: String? = null

    @field:Element
    var bidRate: String? = null

    @field:Element
    var creativeId: String? = null

    @field:Element
    var campaignDisplayOrder: String? = null

    @field:Element
    var averageRatingImageURL: String? = null

    @field:Element
    var clickProxyURL: String? = null
    @field:Element(required = false)
    var minOSVersion: String? = null
    @field:Element
    var rating: String? = null

    @field:Element
    var productName: String? = null

    @field:Element
    var impressionTrackingURL: String? = null

    @field:Element
    var homeScreen: String? = null

    @field:Element
    var numberOfRatings: String? = null

    @field:Element
    var productThumbnail: String? = null

    override fun toString(): String {
        return "ClassPojo [campaignId = $campaignId, appId = $appId, campaignTypeId = $campaignTypeId, productDescription = $productDescription, productId = $productId, isRandomPick = $isRandomPick, callToAction = $callToAction, categoryName = $categoryName, bidRate = $bidRate, creativeId = $creativeId, campaignDisplayOrder = $campaignDisplayOrder, averageRatingImageURL = $averageRatingImageURL, clickProxyURL = $clickProxyURL, minOSVersion = $minOSVersion, rating = $rating, productName = $productName, impressionTrackingURL = $impressionTrackingURL, homeScreen = $homeScreen, numberOfRatings = $numberOfRatings, productThumbnail = $productThumbnail]"
    }
}

