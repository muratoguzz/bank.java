package dev.mrt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<T> elements;

    public Layer(T[] elements) {
        this.elements = new ArrayList<T>(List.of(elements));
    }

    public void Render() {
        for (T element : elements) {
            element.render();
        }
    }
}
