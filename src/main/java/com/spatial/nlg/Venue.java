package com.spatial.nlg;

import java.util.ArrayList;

/**
 *
 * @author donkarlo
 */
public class Venue implements VenueInterface {

    /**
     * Can be any integer other than 0. 0 literally means no value is set.
     */
    private int id;
    private final String type;
    private final String[] eqs;
    private final float size;
    private final int capacity;
    private final double egyConsuption;
    /**
     * To which other venues, this venue has access?
     */
    private final int[] relatedIds;

    /**
     * @param type
     * @param eqs
     * @param size
     * @param capacity
     * @param egyConsuption
     * @param relatedIds
     */
    public Venue(String type, int[] relatedIds, float size, int capacity, double egyConsuption, String[] eqs) {
        this.id = 0;
        this.type = type;
        this.relatedIds = relatedIds;
        this.eqs = eqs;
        this.size = size;
        this.capacity = capacity;
        this.egyConsuption = egyConsuption;
    }

    public String[] getEqs() {
        return eqs;
    }

    public float getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getEgyConsumption() {
        return egyConsuption;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return
     */
    public String getIntroduction() {
        String introduction = "One "
                + this.getType() + " of size "
                + this.getSize() + " with the capacity of "
                + this.getCapacity() + " that consumes "
                + this.getEgyConsumption() + " kilowatt per hour.";
        if (this.getEqs().length > 0) {
            introduction += " It incorporates the following equipments: ";
            for (String eq : this.getEqs()) {
                introduction += " " + eq + ", ";
            }
        }
        return introduction;
    }

    /**
     *
     * @param id
     * @param vc
     */
    public void setId(int id, VenueComposit vc) {
        if (vc.isAUniqueId(id)) {
            this.id = id;
        } else {
            System.out.println(String.valueOf(id) + " is not a unique id for this composit venue");
        }
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public int[] getRelatedIds() {
        return relatedIds;
    }

}
