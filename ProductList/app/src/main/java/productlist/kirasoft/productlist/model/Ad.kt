package productlist.kirasoft.productlist.model

/**
 * Created by dakotajustin on 11/29/16.
 */
class Ad {
    var campaignId: String? = null

    var appId: String? = null

    var campaignTypeId: String? = null

    var productDescription: String? = null

    var productId: String? = null

    var isRandomPick: String? = null

    var callToAction: String? = null

    var categoryName: String? = null

    var bidRate: String? = null

    var creativeId: String? = null

    var campaignDisplayOrder: String? = null

    var averageRatingImageURL: String? = null

    var clickProxyURL: String? = null

    var minOSVersion: String? = null

    var rating: String? = null

    var productName: String? = null

    var impressionTrackingURL: String? = null

    var homeScreen: String? = null

    var numberOfRatings: String? = null

    var productThumbnail: String? = null

    override fun toString(): String {
        return "ClassPojo [campaignId = $campaignId, appId = $appId, campaignTypeId = $campaignTypeId, productDescription = $productDescription, productId = $productId, isRandomPick = $isRandomPick, callToAction = $callToAction, categoryName = $categoryName, bidRate = $bidRate, creativeId = $creativeId, campaignDisplayOrder = $campaignDisplayOrder, averageRatingImageURL = $averageRatingImageURL, clickProxyURL = $clickProxyURL, minOSVersion = $minOSVersion, rating = $rating, productName = $productName, impressionTrackingURL = $impressionTrackingURL, homeScreen = $homeScreen, numberOfRatings = $numberOfRatings, productThumbnail = $productThumbnail]"
    }
}