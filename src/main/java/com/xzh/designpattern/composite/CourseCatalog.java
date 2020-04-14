package com.xzh.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;

    public CourseCatalog(List<CatalogComponent> items, String name) {
        this.items = items;
        this.name = name;
    }

    @Override
    public void add(CatalogComponent component) {
        items.add(component);
    }

    @Override
    public String getName(CatalogComponent component) {
        return this.name;
    }

    @Override
    public void remove(CatalogComponent component) {
        items.remove(component);
    }

    @Override
    public void print() {
        for (CatalogComponent item : items) {
            item.print();
        }
    }
}
