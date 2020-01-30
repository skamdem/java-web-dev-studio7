package org.launchcode.studio7;

public class LP extends StorageMedia implements Spinable {

    public LP(String name, int storageCapacity, String contents){
        super(name,storageCapacity,contents);
    }

    @Override
    public void spinDisc() {
        System.out.println("An LP is spinning ");
    }
}
