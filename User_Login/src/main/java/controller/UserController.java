package controller;

import model.Login;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.DAO;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping("")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return modelAndView;
    }

    @PostMapping("")
    public ModelAndView login(@ModelAttribute Login login) {
        User user = DAO.checkLogin(login);
        if (user == null) {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        }
        else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
