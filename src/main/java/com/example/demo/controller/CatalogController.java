package com.example.demo.controller;

import com.example.demo.model.Catalog;
import com.example.demo.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CatalogController {
    @Autowired
    CatalogRepository repository;

    @GetMapping("/catalogs")
    public String findAll(Model model) {
        List<Catalog> catalogs = repository.findAll();
        model.addAttribute("catalogs", catalogs);
        return "catalogs";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        repository.deleteById(id);
        return "redirect:catalogs";
    }
    @GetMapping("/add")
    public String add() {
        return "add";
    }
    @PostMapping("/add")
    public String add(@ModelAttribute Catalog catalog) {
        repository.save(catalog);
        return "redirect:catalogs";
    }

    @GetMapping("/update")
public String update(@RequestParam int id, Model model){
        Catalog catalog = repository.findById(id).get();
        model.addAttribute("catalog", catalog);
        return "update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Catalog catalog){
        repository.save(catalog);
        return "redirect:catalogs";
    }

}
