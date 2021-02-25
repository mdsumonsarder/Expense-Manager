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

        List<Expense> expense = expenseService.findAll();
        //System.out.println(expenses);
        mav.addObject("expense",expense);

        return mav;
    }


    @RequestMapping("/expense")
    public ModelAndView addexpense()
    {
        ModelAndView mav = new ModelAndView("expense");
        mav.addObject("expense",new Expense());
        return mav;
    }


    @RequestMapping(value = "/expense",method = RequestMethod.POST)
    public String save(@ModelAttribute("expense") Expense expense)
    {
        expenseService.save(expense);
        return "redirect:/";
    }


    @RequestMapping(value = "/expense/{id}")
    public ModelAndView edit(@PathVariable("id") Long id)
    {
        ModelAndView mav = new ModelAndView("expense");
        Expense expense = expenseService.findById(id);
        mav.addObject("expense",expense);
        return mav;
    }



    @RequestMapping(value = "/expense/{id}/delete")
    public String delete(@PathVariable("id") Long id)
    {
       expenseService.delete(id);
        return "redirect:/";
    }



}
