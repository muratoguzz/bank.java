package dev.mrt;

public class Main {
    public static void main(String[] args){

        River[] rivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495", "29.1566, -89.2495"
                        ),
                new River("Missouri",
                        "45.9239, -111.4983", "38.8146, -90.1218")
        };

        Layer<River> riverLayer = new Layer<>(rivers);
        riverLayer.Render();


    }
}
