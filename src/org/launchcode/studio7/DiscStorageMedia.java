package org.launchcode.studio7;

public abstract class DiscStorageMedia extends StorageMedia implements Spinable {
    protected String spinningRate;

    public DiscStorageMedia(String name, int storageCapacity, String contents) {
        super(name, storageCapacity, contents);
    }

    abstract void laserReadsData();

    protected void laserWritesData() {
        spinDisc();
        System.out.println("Data are being stored on the " +  this.getClass().getName() +" entitled \""+ this.getName() + "\" up to a maximum of " + this.getStorageCapacity() + " MB.");
    }

}
