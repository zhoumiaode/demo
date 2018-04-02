package demo.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        int a=12;
        String b="11s";
        System.out.println("1223");
        ss();
        return "index";
    }

    public void ss(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
