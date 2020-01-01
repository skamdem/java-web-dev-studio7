package org.launchcode.studio7;

public class CD extends BaseDisc {
    private String spinningRate = "200 - 500 rpm";
    private String readSpeed = "1MB/s";

    public CD(String name, int storageCapacity, String contents, String discType){
        super(name, storageCapacity, contents, discType);
    }

    @Override
    public void laserReadsData(){
        spinDisc();
        System.out.println("Data are being read from the " + getDiscType() + " at the rate of " + readSpeed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A "+ getDiscType() + " spins at a rate of " + spinningRate);
    }
}
