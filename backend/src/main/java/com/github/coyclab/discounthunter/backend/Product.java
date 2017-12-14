package com.github.coyclab.discounthunter.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;

@Entity
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;
    private int discount;
    private String image;
    private int category;
    private Date from_date;
    private Date since_date;
    private Seller seller;

    public Product() {
    }

    public Product(final String pName, final String pDescription, final Double pPrice,
                   final int pDiscount, final String pImage, final int pCategory,
                   final Date pFromDate, final Date pSinceDate, final Seller pSeller) {
        name = pName;
        description = pDescription;
        price = pPrice;
        discount = pDiscount;
        image = pImage;
        category = pCategory;
        from_date = pFromDate;
        since_date = pSinceDate;
        seller = pSeller;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public String getImage() {
        return image;
    }

    public int getCategory() {
        return category;
    }

    public Date getFromDate() {
        return from_date;
    }

    public Date getSinceDate() {
        return since_date;
    }

    public Seller getSeller() {
        return seller;
    }

}
