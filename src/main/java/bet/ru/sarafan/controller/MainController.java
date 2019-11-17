package bet.ru.sarafan.controller;

import bet.ru.sarafan.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String main(
            @AuthenticationPrincipal User user,
            Model model){
        HashMap<Object, Object> data = new HashMap<>();

        data.put("profile", user);
        data.put("messages", null);
        model.addAttribute("frontendData", data);
        return "main";
    }
}
