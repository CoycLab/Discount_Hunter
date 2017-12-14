package com.github.coyclab.discounthunter.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
class Shop {

    @Id
    private Long id;
    private String address;
    private String working_time;

    Shop(final String pAddress, final String pWorkingTime) {
        address = pAddress;
        working_time = pWorkingTime;
    }

    public Shop() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long pId) {
        id = pId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String pAddress) {
        address = pAddress;
    }

    public String getWorking_time() {
        return working_time;
    }

    public void setWorking_time(String pWorking_time) {
        working_time = pWorking_time;
    }
}