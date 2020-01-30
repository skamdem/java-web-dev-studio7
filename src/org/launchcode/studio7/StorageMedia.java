package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    private int storageCapacity;
    private String name;
    private String contents;
    private String discType;
    public BaseDisc(String name, int storageCapacity, String contents, String discType){
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.contents = contents;
        this.discType = discType;
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

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    protected void laserWritesData(){
        spinDisc();
        System.out.println("Data are being stored on the " + discType + " up to a maximum of " + storageCapacity + " MB.");
    }
}
