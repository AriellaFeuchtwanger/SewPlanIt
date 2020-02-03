package com.craftycodersapps.sewplanit;

public class Pattern {
    private String name;
    private String category;
    private String designer;
    private String link;
    private String notes;
    private String image;
    private String[] suggestedFabrics;
    private int id;

    public Pattern(String name, String category, String designer, String link, String notes, String image, String[] suggestedFabrics, int id) {
        this.name = name;
        this.category = category;
        this.designer = designer;
        this.link = link;
        this.notes = notes;
        this.image = image;
        this.suggestedFabrics = suggestedFabrics;
        this.id = id;
    }

    //Methods

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String[] getSuggestedFabrics() {
        return suggestedFabrics;
    }

    public void setSuggestedFabrics(String[] suggestedFabrics) {
        this.suggestedFabrics = suggestedFabrics;
    }

    public int getID(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }
}
