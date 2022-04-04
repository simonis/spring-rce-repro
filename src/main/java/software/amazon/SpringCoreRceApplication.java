package software.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCoreRceApplication {
    public SpringCoreRceApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreRceApplication.class, args);
    }

    @RequestMapping({"", "/"})
    public String test(User user) {
        return "Hello " + user.getUsername() + "!";
    }
}
