package com.spatial.nlg;

import java.util.ArrayList;

/**
 *
 * @author donkarlo
 */
public class VenueComposit extends Venue implements VenueInterface {

    private final ArrayList<Venue> venues;

    public VenueComposit(ArrayList<Venue> venues) {
        super("", null, 0, 0, 0, null);
        if (venues == null) {
            venues = new ArrayList<Venue>();
        }

        this.venues = venues;
    }

    public VenueComposit addVenue(Venue venue) {
        //If no vemueId is set for this composit, then set one for it
        if (venue.getId() == 0) {
            venue.setId(this.getAUniqueId(), this);
            venues.add(venue);
        }
        return this;
    }

    public ArrayList<Venue> getVenues() {
        return venues;
    }

    public int getCapacity() {
        int cap = 0;
        for (Venue venue : this.getVenues()) {
            cap += venue.getCapacity();
        }
        return cap;
    }
    
    public float getSize(){
        int size = 0;
        for (Venue venue : this.getVenues()) {
            size += venue.getSize();
        }
        return size;
    }
    
    public double getEgyConsumption(){
        int egyConsumption = 0;
        for (Venue venue : this.getVenues()) {
            egyConsumption += venue.getEgyConsumption();
        }
        return egyConsumption;
    }

    public String getIntroduction() {
        String introduction = "This building's total size is: ";
        introduction += this.getSize();
        introduction += " with total capacity of " + this.getCapacity() + " people ";
        introduction += " and energy consumption of " + this.getEgyConsumption()+ " Kilowatts. Here are the details per sub-venues: ";
        for (Venue venue : this.getVenues()) {
            introduction += venue.getIntroduction();
        }
        
        return introduction;
    }

    /**
     *
     * @param id
     * @return
     */
    public boolean isAUniqueId(int id) {
        for (Venue venue : this.getVenues()) {
            if (venue.getId() == id) {
                return false;
            }
        }
        return true;
    }

    private int getAUniqueId() {
        int candidateId = this.venues.size() + 1;
        while (!this.isAUniqueId(candidateId)) {
            candidateId += 1;
        }
        return candidateId;
    }
}
