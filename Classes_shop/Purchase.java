package zadania.shop_shoes.Classes_shop;

import java.io.Serializable;
import java.util.Date;

public class Purchase implements Serializable{
    private Shoes shoes;
    private Date data;
    
    public Shoes getShoes() {
        return shoes;
    }
    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}
