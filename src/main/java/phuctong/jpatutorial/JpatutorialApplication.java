package phuctong.jpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@ComponentScan({"phuctong.jpatutorial.controller", "phuctong.jpatutorial.service"})
@EntityScan("phuctong.jpatutorial.entity")
@EnableJpaRepositories("phuctong.jpatutorial.repository")
@SpringBootApplication
public class JpatutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpatutorialApplication.class, args);
	}

}
