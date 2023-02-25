package com.mahdi.inventiv.web;

import java.util.List;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mahdi.inventiv.models.Case;
import com.mahdi.inventiv.service.ICaseService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CaseRestController {
    private ICaseService service;

    @GetMapping(path = "/cases")
    public List<Case> listCases(){
        return service.getAll();
    } 
    @GetMapping(path = "/cases/{title}")
    public Case getCase(@PathVariable("title") String title){
        System.out.println("slaaaa"+title);
        return service.get(title);
    }
    @PostMapping(path = "/cases")
    public Case postCase(@RequestBody Case c){
        service.add(c);
        return c;
    }

    @PutMapping(path = "/cases/{title}")
    public void putCase(@PathVariable("title") String title, @RequestBody Case c){
        c.setTitle(title);
        service.update(c);
    }


    @DeleteMapping(path = "/cases/{title}")
    public void deleteCase(@PathVariable("title") String title){
        try {
            Long id = service.get(title).getId();
            service.delete(id);
        } catch (Exception e) {
            throw new RuntimeException("id introuvable !!");
        }
    }
}
