package com.example.loan.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loan.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationModelRepository extends JpaRepository<LoanApplicationModel, Integer>{

}

