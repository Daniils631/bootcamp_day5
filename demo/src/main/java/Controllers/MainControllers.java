package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainControllers {

    @GetMapping("/")
    public String home( Model model) {
        model.addAttribute("title", "Glavnaja stranica");
        return "home";
    }

}