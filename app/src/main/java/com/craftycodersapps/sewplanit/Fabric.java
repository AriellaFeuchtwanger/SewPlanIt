package com.craftycodersapps.sewplanit;

public class Fabric {
    private int id;
    private String name;
    private String type;
    private String notes;
    private String[] materials;
    private String image;

    public Fabric(int id, String name, String type, String notes, String[] materials, String image){
        this.id = id;
        this.name = name;
        this.type = type;
        this.notes = notes;
        this.materials = materials;
        this.image = image;
    }

    //Methods

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String[] getMaterials() {
        return materials;
    }

    public void setMaterials(String[] materials) {
        this.materials = materials;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getID(){return id;}
}
