package com.mdss_dev.revisaoJavaSpring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cardapio")
public class CardapioController {

    //requisicoes chegam por aqui

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getCardapio(){
        return "Esse é o meu cardapio!!!";
    }
}
