package com.sumon.xyz.Expense.service;

import com.sumon.xyz.Expense.model.Expense;
import com.sumon.xyz.Expense.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ExpenseServiceImp implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {

        return expenseRepository.findAll();
    }

    @Override
    public void save(Expense expense) {

    }
}
