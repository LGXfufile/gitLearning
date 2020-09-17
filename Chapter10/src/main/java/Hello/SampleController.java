package Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration//表示将该类托管给spring,需要spring来组织；
public class SampleController {

    @RequestMapping("/")//表示访问路径，单斜杠表示在跟目录下来访问
    @ResponseBody
    String home(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);//入口类；
    }
}
