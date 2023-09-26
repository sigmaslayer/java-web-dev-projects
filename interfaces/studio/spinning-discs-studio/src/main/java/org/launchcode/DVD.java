package org.launchcode;

public class DVD extends BaseDisc implements OpticalDiscs {
    public DVD(String name, double capacity, String content, String discType) {
        super(name, capacity, content, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }

    @Override
    public void storeData() {
        System.out.println("Data was stored to DVD!");

    }

    @Override
    public void writeDiscWithLaser() {
        System.out.println("Laser writes data to DVD.");

    }

    @Override
    public void readDiscWithLaser() {
        System.out.println("Laser reads data to DVD.");

    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
