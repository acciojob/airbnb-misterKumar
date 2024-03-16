package com.driver.controllers;

import com.driver.model.Facility;

import java.util.List;

public class UpdateFacilitiesRequest {
    private List<Facility> newFacilities;
    private String hotelName;
    public UpdateFacilitiesRequest(){

    }
    public UpdateFacilitiesRequest(List<Facility> newFacilities, String hotelName) {
        this.newFacilities = newFacilities;
        this.hotelName = hotelName;
    }
    //getters and setters
    public List<Facility> getNewFacilities() {
        return newFacilities;
    }

    public void setNewFacilities(List<Facility> newFacilities) {
        this.newFacilities = newFacilities;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
