package com.learn.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("In home");

        // Send data to the view
        model.addAttribute("name", "John Doe");
        model.addAttribute("youtubeChannel", " https://www.youtube.com/channel/UCF7BExjT2zH_mmyqOB139Dg");
        model.addAttribute("githubProfile", "https://github.com/pabitra-kumar");

        return "home";
    }
}
