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
 * Classe Controller da tela Index
 * @author Tayron Miranda <dev@tayron.com.br>
 */
@Controller
public class IndexController {

    /**
     * Método que gerencia a requisição da tela index
     * 
     * @param model Objeto para setar atributos na tela
     * 
     * @return ModelAndViw Objeto que diz ao Spring qual tela renderizar
     */
    @RequestMapping("/index")
    public ModelAndView bemVindo(Model model){
        return new ModelAndView("index");
    }    
}
