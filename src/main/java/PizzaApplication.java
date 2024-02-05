import bean.ElementiMenu;
import bean.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);

		Menu menu = context.getBean(Menu.class);

		System.out.println("Menu:");

		for (ElementiMenu elementiMenu: menu.getItems()){
			System.out.println(elementiMenu.getNome() + " - $" + elementiMenu.getPrezzo());
		}

		context.close();
	}
}
