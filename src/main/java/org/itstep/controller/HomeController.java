package org.itstep.controller;

import org.itstep.domain.dao.UserDao;
import org.itstep.domain.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

//    @Autowired
//    private ConversionService conversionService;

    private final UserDao userDao;

    public HomeController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "index";
    }

    @PostMapping
    public String create(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("customerDto = " + userDto);
            System.out.println("bindingResult = " + bindingResult);
            return "index";
        }
        userDao.save(userDto.toEntity());
        return "redirect:/";
    }


}
