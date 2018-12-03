package snippet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {


    @GetMapping("/")
    public String greeting() {
        return "hello/index";
    }


    @GetMapping("/layout")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "stock/layout";
    }

    @GetMapping("/hello")
    public String webpack(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello/index";// test commit
    }

}