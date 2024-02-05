
import bean.ElementiMenu;
import bean.Menu;
import bean.Pizze;
import bean.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class PizzaConfig {
    @Bean
    public Pizze margherita(){
        Pizze pizza = new Pizze();
        pizza.setNome("Margherita");
        pizza.setPrezzo(5.50);
        pizza.setToppings(new ArrayList<>());

        return pizza;
    }

    @Bean
    public Topping prosciutto(){
        Topping topping = new Topping();
        topping.setNome("Prosciutto");
        topping.setPrezzo(2.30);
        return topping;
    }


    @Bean
    public Topping ananas(){
        Topping topping = new Topping();
        topping.setNome("Ananas");
        topping.setPrezzo(2.50);
        return topping;
    }

    @Bean
    public Menu menu(Pizze margherita, Topping prosciutto, Topping ananas){
        Menu menu = new Menu();
        menu.setItems(Arrays.asList(margherita, prosciutto, ananas));
        return menu;
    }
}
