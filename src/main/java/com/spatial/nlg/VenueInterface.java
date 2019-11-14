package com.spatial.nlg;

/**
 * Whatever is common between venue and venueComposits
 * @author donkarlo
 */
public interface VenueInterface {

    public String[] getEqs();

    public float getSize();

    public int getCapacity();

    public double getEgyConsumption();

    public String getIntroduction();

    public int getId();
}
