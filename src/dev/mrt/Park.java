package dev.mrt;

public class Park extends Point{

    private String name;

    public Park(String name ,String locations) {

        super(locations);
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " Park";
    }
}
