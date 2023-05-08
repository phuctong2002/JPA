package phuctong.jpatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"phuctong.jpatutorial.controller", "phuctong.jpatutorial.service", "phuctong.jpatutorial.test", "phuctong.jpatutorial"})
@EntityScan("phuctong.jpatutorial.entity")
@EnableJpaRepositories("phuctong.jpatutorial.repository")
@SpringBootApplication
//@EnableDiscoveryClient
public class JpatutorialApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpatutorialApplication.class, args);
    }

}
