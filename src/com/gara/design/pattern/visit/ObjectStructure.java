package com.gara.design.pattern.visit;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public ObjectStructure addElement(Element element){
        elements.add(element);
        return this;
    }

    public void removeElement(Element element){
        elements.removeIf(e -> e.equals(element));
    }

    public void accept(Visitor visitor){
        elements.forEach(e-> e.acceptVisitor(visitor));
    }
}
