package com.ananarcisio.netflix.controller;

import com.ananarcisio.netflix.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/")
    public String index(Model model) {
        // Envia todos os filmes do banco para a página index.html
        model.addAttribute("movies", movieRepository.findAll());
        return "index";
    }
}