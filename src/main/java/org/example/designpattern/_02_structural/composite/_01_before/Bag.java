package org.example.designpattern._02_structural.composite._01_before;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bag {

    private List<Item> items = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
    }
}
