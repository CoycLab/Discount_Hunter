package com.github.coyclab.discounthunter.backend;

import java.util.List;

class Seller {

    private String mName;
    private List<Shop> mShopList;
    private String mSellerLogo;

    Seller(final String pName, final List<Shop> pShopList, final String pSellerLogo) {
        mName = pName;
        mShopList = pShopList;
        mSellerLogo = pSellerLogo;
    }
}