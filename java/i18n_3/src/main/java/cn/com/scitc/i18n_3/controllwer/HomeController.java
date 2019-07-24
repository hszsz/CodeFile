package cn.com.scitc.i18n_3.controllwer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping("/")
    private String page(){
        return "home";
    }
}
