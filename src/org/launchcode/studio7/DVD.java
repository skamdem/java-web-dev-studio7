package org.launchcode.studio7;

public class DVD extends DiscStorageMedia {

    public DVD(String name, int storageCapacity, String contents){
        super(name, storageCapacity, contents);
        this.spinningRate = "570 - 1600 rpm";
        this.readSpeed = "1MB/s";
    }

    @Override
    public void laserReadsData(){
        spinDisc();
        System.out.println("Data are being read from the "+  this.getClass().getName() +" entitled \"" + this.getName() + " at the rate of " + readSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A "+ this.getClass().getName() +" entitled \"" + this.getName() + "\" spins at a rate of " + spinningRate);
    }
}
