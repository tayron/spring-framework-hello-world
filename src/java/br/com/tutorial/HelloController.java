/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Classe Controller da tela Bem vindo
 * 
 * @author Tayron Miranda <dev@tayron.com.br>
 */
@Controller
public class HelloController {

    /**
     * Método que gerencia a requisição da tela bemvindo
     * 
     * @param model Objeto para setar atributos na tela
     * 
     * @return ModelAndViw Objeto que diz ao Spring qual tela renderizar
     */
    @RequestMapping("/bemvindo")
    public ModelAndView bemVindo(Model model){
        model.addAttribute("bemvindo" , "Olha só que facil dizer bem vindo");
        return new ModelAndView("bemvindo");
    }    
}
