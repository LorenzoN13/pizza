import bean.Pizze;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

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
}
