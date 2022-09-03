package com.estudante.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.estudante.demo.model.Pessoa;

@Controller
public class Home {

    @GetMapping("home")
    public String home(Model model){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Juliana");
        pessoa.setSobreNome("Lobo");

        model.addAttribute("p", pessoa);
        
        System.out.println("--------------------> " + pessoa.getNome());
        return "index";
    }
    
}
