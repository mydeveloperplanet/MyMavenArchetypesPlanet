#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBasicProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBasicProjectApplication.class, args);
	}

}
