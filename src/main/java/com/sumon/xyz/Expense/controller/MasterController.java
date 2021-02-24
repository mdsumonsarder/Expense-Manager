package com.sumon.xyz.Expense.controller;

import com.sumon.xyz.Expense.model.Expense;
import com.sumon.xyz.Expense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class MasterController {

    @Autowired
    ExpenseService expenseService;


    @RequestMapping("/")
    public ModelAndView home()
    {
        ModelAndView mav = new ModelAndView("home");
        //addObject method is send message controller to jsp file;
        mav.addObject("message","List of expenses");

        List<Expense> expenses = expenseService.findAll();
        //System.out.println(expenses);
        mav.addObject("expenses",expenses);

        return mav;
    }


}
