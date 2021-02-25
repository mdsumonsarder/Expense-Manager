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
        expense.setCreatedAt(System.currentTimeMillis());
        expenseRepository.save(expense);

    }


    @Override
    public Expense findById(Long id) {
        if (expenseRepository.findById(id).isPresent())
        {
            return expenseRepository.findById(id).get();
        }
        return null;
    }


    @Override
    public void delete(Long id) {
      Expense expense = findById(id);
      expenseRepository.delete(expense);
    }

}
