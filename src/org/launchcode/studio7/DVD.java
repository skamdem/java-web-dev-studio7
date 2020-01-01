package org.launchcode.studio7;

public class DVD extends BaseDisc {
    private String spinningRate = "570 - 1600 rpm";
    private String readSpeed = "1MB/s";

    public DVD(String name, int storageCapacity, String contents, String discType){
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
