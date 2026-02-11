package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {

    private final String city;
    private final String province;

    /**
     * Constructor for City.
     * @param city The name of the city.
     * @param province The name of the province.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the city name
     * @return return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the province name
     * @return return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares two City objects based on city name.
     * @param o The city to compare to.
     * @return a negative integer, zero, or a positive integer as this city name
     *          is less than, equal to, or greater than the specified city name.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
