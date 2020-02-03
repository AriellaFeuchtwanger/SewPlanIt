package com.craftycodersapps.sewplanit;

public class Project {
    public int id;
    public String name;
    public String date;
    public String image;
    public int yards;
    public String status;
    public Fabric fabric;
    public Pattern pattern;

    public Project(int id, String name, String date, String image, int yards, String status, Fabric fabric, Pattern pattern) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.image = image;
        this.yards = yards;
        this.status = status;
        this.fabric = fabric;
        this.pattern = pattern;
    }

    public Project(int id, String name, String date, String image, int yards, String status, Fabric fabric) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.image = image;
        this.yards = yards;
        this.status = status;
        this.fabric = fabric;
    }

    public Project(int id, String name, String date, String image, int yards, String status, Pattern pattern) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.image = image;
        this.yards = yards;
        this.status = status;
        this.pattern = pattern;
    }

    public Project(int id, String name, String date, String image, int yards, String status) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.image = image;
        this.yards = yards;
        this.status = status;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getYards() {
        return yards;
    }

    public void setYards(int yards) {
        this.yards = yards;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public int getID(){return this.id;}
}
