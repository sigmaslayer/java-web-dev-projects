package org.launchcode;

public class CD extends BaseDisc implements OpticalDiscs {
    public CD(String name, double capacity, String content, String discType) {
        super(name, capacity, content, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("Data was stored to the CD!");

    }

    @Override
    public void writeDiscWithLaser() {
        System.out.println("Laser writes data to CD.");

    }

    @Override
    public void readDiscWithLaser() {
        System.out.println("Laser reads data to CD.");

    }
    // TODO: Implement your custom interface.


    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
