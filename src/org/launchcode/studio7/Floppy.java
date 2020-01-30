package org.launchcode.studio7;

public class Floppy extends StorageMedia implements Spinable {
    public Floppy(String name, int storageCapacity, String contents){
        super(name,storageCapacity,contents);
    }
    @Override
    public void spinDisc() {
        System.out.println("An floppy is spinning ");
    }
}
