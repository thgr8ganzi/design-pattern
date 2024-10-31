package org.example.designpattern._02_structural.composite._02_after;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bag implements Component{
    List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
