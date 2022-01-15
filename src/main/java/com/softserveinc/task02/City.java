package com.softserveinc.task02;

public class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public City() {
    }

    public City(String name, String region, String country, int inhabitants) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        return  "City: " + name + "\n" +
                "Region: " + region + "\n" +
                "Country: " + country + "\n" +
                "inhabitants: " + inhabitants + "\n";
    }
}
