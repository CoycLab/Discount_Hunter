package com.github.coyclab.discounthunter.model.shop;

import com.google.gson.annotations.SerializedName;

public class Shop implements IShop {

    private static final String ID = "id";
    private static final String ADDRESS = "address";
    private static final String WORKING_TIME = "working_time";

    @SerializedName(ID)
    private Long mId;

    @SerializedName(ADDRESS)
    private String mAddress;

    @SerializedName(WORKING_TIME)
    private String mWorkingTime;

    @Override
    public Long getID() {
        return mId;
    }

    @Override
    public String getAddress() {
        return mAddress;
    }

    @Override
    public String getWorkingTime() {
        return mWorkingTime;
    }
}
