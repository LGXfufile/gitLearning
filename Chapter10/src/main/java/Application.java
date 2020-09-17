import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//表示托管给spring；
@ComponentScan("com.course.server")//代表要扫描哪些组件，扫描哪个包下的类；
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
