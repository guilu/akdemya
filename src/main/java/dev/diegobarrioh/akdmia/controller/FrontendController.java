package dev.diegobarrioh.akdmia.controller;


import dev.diegobarrioh.akdmia.domain.entity.Unit;
import dev.diegobarrioh.akdmia.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FrontendController {

    private final ApiService apiService;

    public FrontendController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/units")
    public String unitList(Model model){
        List<Unit> units = apiService.getUnits();
        model.addAttribute("units", units);
        return "units";
    }

}
