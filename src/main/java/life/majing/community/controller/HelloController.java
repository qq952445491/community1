package life.majing.community.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    //uri中需要输入的name值
    public String hello(@RequestParam(name = "name") String name, Model model) {
        //name是html页面中需要的值
        model.addAttribute("name",name);
        return "hello";

    }
}
