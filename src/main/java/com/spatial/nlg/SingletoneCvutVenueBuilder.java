package com.spatial.nlg;

import com.spatial.nlg.venue.Corridor;
import com.spatial.nlg.venue.Kitchen;
import com.spatial.nlg.venue.BathRoom;

/**
 *
 * @author donkarlo
 */
public class SingletoneCvutVenueBuilder {

    private static SingletoneCvutVenueBuilder inst = null;
    private final VenueComposit venueComposit;

    private SingletoneCvutVenueBuilder() {
        venueComposit = new VenueComposit(null);
        Kitchen kitchen = new Kitchen(null, 12, 5, 100, new String[]{"microwave", "refrigerator", "table"});
        BathRoom bathRoom1 = new BathRoom(null, 6, 1, 30, new String[]{"mirror", "soap"});
        BathRoom bathRoom2 = new BathRoom(null, 7, 1, 40, new String[]{"mirror", "soap", "hand dryer"});
        venueComposit.addVenue(kitchen)
                .addVenue(bathRoom1)
                .addVenue(bathRoom2);
        Corridor corridor = new Corridor(new int[]{kitchen.getId(), bathRoom1.getId(), bathRoom2.getId()}, 60, 20, 300, new String[]{"water dispenser"});
        venueComposit.addVenue(corridor);
    }

    public static SingletoneCvutVenueBuilder getInstance() {
        if (inst == null) {
            inst = new SingletoneCvutVenueBuilder();
        }
        return inst;
    }

    public VenueComposit getVenueComposit() {
        return SingletoneCvutVenueBuilder.getInstance().venueComposit;
    }

}
