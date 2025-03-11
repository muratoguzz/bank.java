package dev.mrt;

import java.util.Arrays;

abstract class Point implements Mappable {

    private double[] location = new double[2];

    public Point(String locations) {
        this.location = Mappable.stringToLatLon(locations);
    }

    @Override
    public void render() {
        System.out.println("Render " + this + " as POINT (" + location() + ")");
    }

    private String location() {
        return Arrays.toString(location);
    }
}