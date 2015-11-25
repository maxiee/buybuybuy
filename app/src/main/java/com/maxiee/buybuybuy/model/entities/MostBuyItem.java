package com.maxiee.buybuybuy.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by maxiee on 15/11/25.
 */
public class MostBuyItem {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("site")
    @Expose
    private String site;
    @SerializedName("siteName")
    @Expose
    private String siteName;
    @SerializedName("imgUrl")
    @Expose
    private String imgUrl;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("priceunit")
    @Expose
    private String priceunit;
    @SerializedName("priceunitSymbol")
    @Expose
    private String priceunitSymbol;
    @SerializedName("counts")
    @Expose
    private Integer counts;

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The site
     */
    public String getSite() {
        return site;
    }

    /**
     *
     * @param site
     * The site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     *
     * @return
     * The siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     *
     * @param siteName
     * The siteName
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     *
     * @return
     * The imgUrl
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     *
     * @param imgUrl
     * The imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     *
     * @return
     * The price
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The priceunit
     */
    public String getPriceunit() {
        return priceunit;
    }

    /**
     *
     * @param priceunit
     * The priceunit
     */
    public void setPriceunit(String priceunit) {
        this.priceunit = priceunit;
    }

    /**
     *
     * @return
     * The priceunitSymbol
     */
    public String getPriceunitSymbol() {
        return priceunitSymbol;
    }

    /**
     *
     * @param priceunitSymbol
     * The priceunitSymbol
     */
    public void setPriceunitSymbol(String priceunitSymbol) {
        this.priceunitSymbol = priceunitSymbol;
    }

    /**
     *
     * @return
     * The counts
     */
    public Integer getCounts() {
        return counts;
    }

    /**
     *
     * @param counts
     * The counts
     */
    public void setCounts(Integer counts) {
        this.counts = counts;
    }

}
