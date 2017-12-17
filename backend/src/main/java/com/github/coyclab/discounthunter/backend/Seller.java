package com.github.coyclab.discounthunter.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.List;

@Entity
class Seller {

    @Id
    private Long id;
    private String seller_name;
    private List<Shop> shop_list;
    private String seller_logo;

    public Seller() {
    }

    Seller(final String pName, final List<Shop> pShopList, final String pSellerLogo) {
        seller_name = pName;
        shop_list = pShopList;
        seller_logo = pSellerLogo;
    }

    public Long getId() {
        return id;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public List<Shop> getShop_list() {
        return shop_list;
    }

    public String getSeller_logo() {
        return seller_logo;
    }
}