package guru.springframework.sping5jokesapp.controllers;

import guru.springframework.sping5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeservice;

    public JokeController(JokeService jokeservice) {
        this.jokeservice = jokeservice;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {
        model.addAttribute("joke",jokeservice.sayJoke());
        return "index";
    }
}
