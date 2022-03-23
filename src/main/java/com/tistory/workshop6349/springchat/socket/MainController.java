package com.tistory.workshop6349.springchat.socket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class MainController {

    @GetMapping("/chat")
    public String chat(Locale locale, Model model) {
        return "chat";
    }
}
