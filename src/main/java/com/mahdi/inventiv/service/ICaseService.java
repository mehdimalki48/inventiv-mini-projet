package com.mahdi.inventiv.service;

import java.util.List;

import com.mahdi.inventiv.models.Case;

public interface ICaseService {
    public Case add(Case c);
    public void delete(Long id);
    public void update(Case c);
    public Case get(Long id);
    public Case get(String title);
    public List<Case> getAll();

}
