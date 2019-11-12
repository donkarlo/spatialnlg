package com.spatial.nlg.venue;
import com.spatial.nlg.VenueInterface;
import com.spatial.nlg.Venue;
/**
 *
 * @author donkarlo
 */
public class Kitchen extends Venue implements VenueInterface{

    public Kitchen(int[] relatedIds, float size, int capacity, double egyConsuption, String[] eqs) {
        super("Kitchen", null,size, capacity, egyConsuption, eqs);
    }
    
}
