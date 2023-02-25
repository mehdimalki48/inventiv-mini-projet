package com.mahdi.inventiv.repositories;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mahdi.inventiv.models.Case;


public interface CaseRepository extends JpaRepository<Case, Long>{
    public Case findCaseById(Long id);
    public Case findCaseByCreationDate(Date creation);
    public Case findCaseByTitle(String title);
}
