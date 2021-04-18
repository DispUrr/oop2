package ru.netology.domain;

public class GeoInfo {
    private String geoType;
    private String geoCoordinates;
    private String geoPlace;

    public String getGeoType() {
        return geoType;
    }

    public void setGeoType(String geoType) {
        this.geoType = geoType;
    }

    public String getGeoCoordinates() {
        return geoCoordinates;
    }

    public void setGeoCoordinates(String geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }

    public String getGeoPlace() {
        return geoPlace;
    }

    public void setGeoPlace(String geoPlace) {
        this.geoPlace = geoPlace;
    }
}
