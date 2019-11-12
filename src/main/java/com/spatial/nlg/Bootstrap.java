package com.spatial.nlg;
/**
 *
 * @author donkarlo
 */
public class Bootstrap {
    public static void main(String [] args){
        VenueComposit cvut = SingletoneCvutVenueBuilder.getInstance().getVenueComposit();
        System.out.println(cvut.getIntroduction());
    }
}
