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

    public String getAddress() {
        return address;
    }

    public String getWorking_time() {
        return working_time;
    }

}