package com.spatial.nlg.venue;
import com.spatial.nlg.VenueInterface;
import com.spatial.nlg.Venue;
/**
 *
 * @author donkarlo
 */
public class Corridor extends Venue implements VenueInterface{

    public Corridor(int[] relatedIds, float size, int capacity, double egyConsuption, String[] eqs) {
        super("Corridor", relatedIds, size, capacity, egyConsuption, eqs);
    }
    
}
