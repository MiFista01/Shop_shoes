package zadania.shop_shoes.ui;

import java.util.List;

import zadania.shop_shoes.Classes_shop.Person;
import zadania.shop_shoes.Classes_shop.Shoes;

public interface Keeping {
    public void save_persons(List<Person>persons);
    public List<Person> load_persons();

    public void save_shoeses(List<Shoes> shoeses);
    public List<Shoes> load_shoes();
}
