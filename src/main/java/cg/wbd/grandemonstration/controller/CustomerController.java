package cg.wbd.grandemonstration.controller;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public ModelAndView showList(Model model) {
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("customers/list","customers",customers);
//        modelAndView.addObject("customers",customers);
        return modelAndView;
//        List<Customer> customers = customerService.findAll();
//        model.addAttribute("customers",customers);
//        return "customers/list";
    }
}