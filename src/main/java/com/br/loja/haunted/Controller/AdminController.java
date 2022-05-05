package com.br.loja.haunted.Controller;

import com.br.loja.haunted.Model.Category;
import com.br.loja.haunted.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminController {


    @Autowired
    CategoryService categoryService;

    @GetMapping("/admin")
    public ModelAndView admin() {
        return new ModelAndView("admin-home");
    }

    @GetMapping("/admin/categories")
    public ModelAndView getCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategory());
        return new ModelAndView("categories");
    }

    @GetMapping("/admin/categories/add")
    public ModelAndView getCategoriesAdd(Model model) {
        model.addAttribute("category", new Category());
        return new ModelAndView("categories-add");
    }

    @PostMapping("/admin/categories/add")
    public ModelAndView postCategoriesAdd(@ModelAttribute("category") Category category) {
        categoryService.addCategory(category);
        return new ModelAndView("redirect:/admin/categories");
    }

    @GetMapping("/admin/categories/delete/{id}")
    public ModelAndView deleteCategories(@PathVariable int id) {
        categoryService.removeCategoriesById(id);
        return new ModelAndView("redirect:/admin/categories");
    }


}
