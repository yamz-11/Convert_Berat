/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConverterBerat_20200140103.ConverterBerat_20200140103;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Wiratama
 */
@Controller
public class ProjectController {
    
    @RequestMapping("/berat")
    //ResponseBody
    public String getHasil(HttpServletRequest data, Model get){
        
        int getKilogram = Integer.parseInt(data.getParameter("kilogram"));
        
        int beratPounds = beratPounds(getKilogram);
        int beratOns = beratOns(getKilogram);
        int beratTon = beratTon(getKilogram);
        int beratKuintal = beratKuintal(getKilogram);
        int beratGram = beratGram(getKilogram);
        
        get.addAttribute("kilogram", getKilogram);
        get.addAttribute("beratPounds",beratPounds);
        get.addAttribute("beratOns", beratOns);
        get.addAttribute("beratTon", beratTon);
        get.addAttribute("beratKuintal", beratKuintal);
        get.addAttribute("beratGram", beratGram);
       
        
        return "tabelview";
    }
    
    private int beratPounds(int getKilogram){
        int pound = (int) (getKilogram * 2.20462);
        return pound;
    }
    
    private int beratOns(int getKilogram){
        int Ons = (int) (getKilogram *35.2739199982575);
        return Ons;
    }
    
    private int beratTon(int getKilogram){
        int ton = (int) (getKilogram /1000);
        return ton;
    }
    
    private int beratKuintal(int getKilogram){
        int kuintal = (int) (getKilogram /100);
        return kuintal;
    }
    
    private int beratGram(int getKilogram){
        int gram = (int) (getKilogram *1000);
        return gram;
    }
    
    
    
}
