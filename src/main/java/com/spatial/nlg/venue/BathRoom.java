package com.spatial.nlg.venue;
import com.spatial.nlg.VenueInterface;
import com.spatial.nlg.Venue;
/**
 *
 * @author donkarlo
 */
public class BathRoom extends Venue implements VenueInterface{

    public BathRoom(int[] relatedIds, float size, int capacity, double egyConsuption, String[] eqs) {
        super("BathRoom", relatedIds, size, capacity, egyConsuption, eqs);
    }
    
}
