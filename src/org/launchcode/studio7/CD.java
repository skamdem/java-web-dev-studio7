package org.launchcode.studio7;

public class CD extends DiscStorageMedia {

    public CD(String name, int storageCapacity, String contents){
        super(name, storageCapacity, contents);
        this.spinningRate = "200 - 500 rpm";
        this.readSpeed = "1MB/s";
    }

    @Override
    public void laserReadsData(){
        spinDisc();
        System.out.println("Data are being read from the " +this.getClass().getName() +" entitled \""+ this.getName() + "\" at the rate of " + readSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A "+ this.getName() + " spins at a rate of " + spinningRate);
    }
}
