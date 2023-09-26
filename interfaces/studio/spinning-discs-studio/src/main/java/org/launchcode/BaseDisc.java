package org.launchcode;

public abstract class BaseDisc {
    protected String name;
    protected double capacity;
    protected String content;
    protected String discType;

    //Constructor
    public BaseDisc(String name, double capacity, String content, String discType)  {
        this.name = name;
        this.capacity = capacity;
        this.content = content;
        this.discType = discType;
    }
}
