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

    public void setId(Long pId) {
        id = pId;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String pSeller_name) {
        seller_name = pSeller_name;
    }

    public List<Shop> getShop_list() {
        return shop_list;
    }

    public void setShop_list(List<Shop> pShop_list) {
        shop_list = pShop_list;
    }

    public String getSeller_logo() {
        return seller_logo;
    }

    public void setSeller_logo(String pSeller_logo) {
        seller_logo = pSeller_logo;
    }
}