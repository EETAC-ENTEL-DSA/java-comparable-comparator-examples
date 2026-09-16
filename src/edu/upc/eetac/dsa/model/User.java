package edu.upc.eetac.dsa.model;

public class User implements Comparable<User>{
    private  String name;
    private  String surname;
    private int id;
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public User(int id, String name, String surname, double rating) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(this.getId(), o.getId());
    }

    @Override
    public String toString() {
        return this.id+" \t"+this.name+"\t"+this.surname +"\t"+this.rating;
    }
}
