package dev.mrt;

import java.util.Arrays;
import java.util.List;

public interface Mappable {
    void render();

    static double[] stringToLatLon(String locations) {
        var splitLocations = locations.split(",");
        var lat = Double.valueOf(splitLocations[0]);
        var lon = Double.valueOf(splitLocations[1]);
        return new double[]{lat, lon};
    }
}




