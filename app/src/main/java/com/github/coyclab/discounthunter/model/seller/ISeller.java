package com.github.coyclab.discounthunter.model.seller;

import com.github.coyclab.discounthunter.model.shop.Shop;

import java.util.List;

public interface ISeller {

    Long getID();

    String getName();

    List<Shop> getShopList();

    String getSellerLogo();
}
