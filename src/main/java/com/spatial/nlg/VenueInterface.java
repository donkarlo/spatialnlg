package com.spatial.nlg;

/**
 * Whatever is common between Venue and VenueComposits
 * @author donkarlo
 */
public interface VenueInterface {

    public String[] getEqs();

    public float getSize();

    public int getCapacity();

    public double getEgyConsumption();

    public String getIntroduction();

    public int getId();
    
    public void setId (int id, VenueComposit vc);
}
