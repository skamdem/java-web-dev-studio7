package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        //Declare and initialize a CD and a DVD object.
        //String name, int storageCapacity, String contents, String discType
        CD myCd = new CD("Learn programming in Javascript", 650, "Source code", "CD");
        DVD myDvd = new DVD("Learn programming in Java", 6000, "SDK", "DVD");

        // Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();

        myCd.laserWritesData();

    }
}
