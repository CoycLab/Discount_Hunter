package com.github.coyclab.discounthunter.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;

@Entity
public class Product {

    @Id
    private String id;
    private String mName;
    private String mDescription;
    private Double mPrice;
    private int mDiscount;
    private String mImage;
    private int mCategory;
    private Date mFromDate;
    private Date mSinceDate;
    private Seller mSeller;

    public Product() {
    }

    public Product(final String pName, final String pDescription, final Double pPrice,
                   final int pDiscount, final String pImage, final int pCategory,
                   final Date pFromDate, final Date pSinceDate, final Seller pSeller) {
        mName = pName;
        mDescription = pDescription;
        mPrice = pPrice;
        mDiscount = pDiscount;
        mImage = pImage;
        mCategory = pCategory;
        mFromDate = pFromDate;
        mSinceDate = pSinceDate;
        mSeller = pSeller;
    }

    public void setId(final String pId) {
        id = pId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }

    public Double getPrice() {
        return mPrice;
    }

    public int getDiscount() {
        return mDiscount;
    }

    public String getImage() {
        return mImage;
    }

    public int getCategory() {
        return mCategory;
    }

    public Date getFromDate() {
        return mFromDate;
    }

    public Date getSinceDate() {
        return mSinceDate;
    }

    public Seller getSeller() {
        return mSeller;
    }

}
