package zadania.shop_shoes.Classes_shop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable{
    private String name;
    private String password;
    private String phone;
    private double purse;
    private List<Shoes> purchase = new ArrayList<>();
    private double incom = 0;
    
    @Override
    public String toString() {
        return "Person [incom=" + incom + ", name=" + name + ", password=" + password + ", phone=" + phone
                + ", purchase=" + purchase + ", purse=" + purse + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getPurse() {
        return purse;
    }
    public void setPurse(double purse) {
        this.purse = purse;
    }
    public List<Shoes> getPurchase() {
        return purchase;
    }
    public void setPurchase(List<Shoes> purchase) {
        this.purchase = purchase;
    }
    public double getIncom() {
        return incom;
    }
    public void setIncom(double incom) {
        this.incom = incom;
    }
}
 