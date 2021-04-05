/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.freight.model;

/**
 *
 * @author qwe
 */
public class Freight {
    private String types;
    private String city;
    private String PlaceOfArrival;
    private int costs;
    private int time;

    public Freight(String types, String city, String PlaceOfArrival, int costs, int time) {
        this.types = types;
        this.city = city;
        this.PlaceOfArrival = PlaceOfArrival;
        this.costs = costs;
        this.time = time;
    }

    /**
     * @return the name
     */
    public String getTypes() {
        return types;
    }

    /**
     * @param types the name to set
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     * @return the color
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the color to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the race
     */
    public String getPlaceOfArrival() {
        return PlaceOfArrival;
    }

    /**
     * @param PlaceOfArrival the race to set
     */
    public void setPlaceOfArrival(String PlaceOfArrival) {
        this.PlaceOfArrival = PlaceOfArrival;
    }

    /**
     * @return the age
     */
    public int getCosts() {
        return costs;
    }

    /**
     * @param costs the age to set
     */
    public void setcosts(int costs) {
        this.costs = costs;
    }

    /**
     * @return the size
     */
    public int getTime() {
        return time;
    }

    /**
     * @param time the size to set
     */
    public void setTime(int time) {
        this.time = time;
    }
    
    
    
}
