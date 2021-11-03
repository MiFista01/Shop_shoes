package zadania.shop_shoes.Classes_shop;

import java.io.Serializable;

public class Shoes implements Serializable{
    private Person person;
    private String name;
    private int size;
    private String color;
    private double price;
    private int piece;
    
    @Override
    public String toString() {
        return "Shoes [color=" + color + ", name=" + name + ", person=" + person + ", piece=" + piece + ", price="
                + price + ", size=" + size + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getPiece() {
        return piece;
    }
    public void setPiece(int piece) {
        this.piece = piece;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
}
