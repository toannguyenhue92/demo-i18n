package toan.demo.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = "/home")
    public String getHomepage() {
        return "home";
    }
}
