package org.launchcode.studio7;

public abstract class StorageMedia {
    private int storageCapacity;
    private String name;
    private String contents;
    protected String readSpeed;

    public StorageMedia(String name, int storageCapacity, String contents){
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
