package com.streamvibe.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmes")
public class FilmesController {
  

    @PostMapping("/cadastrar")
    public void cadastrarFilme( @RequestBody String dados ){
        System.out.println(dados);
    }
}
