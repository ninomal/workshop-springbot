package ninomal.comp.corse.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import ninomal.comp.corse.entities.Category;
import ninomal.comp.corse.entities.Order;
import ninomal.comp.corse.entities.User;
import ninomal.comp.corse.enums.OrderStatus;
import ninomal.comp.corse.repositories.CategoryRepository;
import ninomal.comp.corse.repositories.OrderRepository;
import ninomal.comp.corse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CategoryRepository category;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		
		User u1 = new User(null, "Maria ma", "maria@gmail.com", "9999999", "123456");
		User u2 = new User(null, "joao jo", "jaoa@gmail.com", "9999989", "1234567");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), u1,OrderStatus.WAITING); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2,OrderStatus.DELIVIRED); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1,OrderStatus.CANCELED);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		category.saveAll(Arrays.asList(cat1, cat2, cat3));
	}

	
	
	
}
