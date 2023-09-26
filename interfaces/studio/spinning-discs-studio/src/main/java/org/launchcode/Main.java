package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Evanescence", 700, "Bring me to Life, My Immortal, ...", "CD");
        DVD myDVD = new DVD("Wolf of Wall Street", 4.7, "Story Of Jordan Belfort", "DVD");
        // TODO: Call each CD and DVD method to verify that they work as expected.

        myCD.spinDisc();
        myCD.storeData();
        myCD.readDiscWithLaser();
        myCD.writeDiscWithLaser();
        myDVD.spinDisc();
        myDVD.storeData();
        myDVD.readDiscWithLaser();
        myDVD.writeDiscWithLaser();

        System.out.println(myCD.name);
        System.out.println(myDVD.content);
    }
}
