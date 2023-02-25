package com.mahdi.inventiv.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mahdi.inventiv.models.Case;
import com.mahdi.inventiv.repositories.CaseRepository;

import lombok.AllArgsConstructor;



@Service
@Transactional
@AllArgsConstructor
public class CaseServiceImpl implements ICaseService{

    private CaseRepository caseRepository;


    @Override
    public Case add(Case c) {
        caseRepository.save(c);
        return c;
    }

    @Override
    public void delete(Long id) {
        caseRepository.delete(get(id));
    }

    @Override
    public void update(Case c) {
        caseRepository.save(c);
    }

    @Override
    public Case get(Long id) {
        return caseRepository.findCaseById(id);
    }

    @Override
    public Case get(String title) {
        return caseRepository.findCaseByTitle(title);
    }

    @Override
    public List<Case> getAll() {
        return caseRepository.findAll();
    }
}
