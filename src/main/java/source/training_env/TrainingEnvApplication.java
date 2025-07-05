package source.training_env;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingEnvApplication {

    @PostConstruct
    public static void loadENV(){
        Dotenv dotenv = Dotenv.configure().directory("src/main/resources/.env").load();
        dotenv.entries()
                .forEach((entry) -> {
                    System.setProperty(entry.getKey(), entry.getValue());
                });
    }

    public static void main(String[] args) {

        loadENV();
        SpringApplication.run(TrainingEnvApplication.class, args);
    }

}
