package com.example.CssTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BlogRepo blogRepo;

    @GetMapping("/helloWorld")
    public String helloWorld () {
        return "helloWorld";
    }

    @GetMapping("/")
    public String mainPage (Model model, @ModelAttribute UserProfile userProfile) {
//        userRepo.login(username, password);
        model.addAttribute("user", userProfile);
        return "mainPage";
    }

    @PostMapping ("/")
    public String mainPage (Model model, @RequestParam String username, @RequestParam String password){
        userRepo.login(username, password);
        return "redirect:/forum";
    }

    @GetMapping("/createUser")
    public String create(Model model) {
        model.addAttribute("userProfile", new UserProfile());
        return "createUser";
    }

    @PostMapping("/save")
    public String createUser (@ModelAttribute UserProfile userProfile) {
        userRepo.save(userProfile);
        return "redirect:/";
    }


    @GetMapping("/error")
    public String error(){
        return "error";
    }

    @GetMapping("/forum")
    public String forum (Model model){
        List<BlogPost> blog = (List)blogRepo.findAll();
        model.addAttribute("blogpost",blog);
        return "forum";
    }

    @GetMapping("/newblogpost")
    public String createBlogpost (Model model){
        model.addAttribute("blogpost", new BlogPost());
        return "blogPost";
    }

    @PostMapping("/saveBlogpost")
    public String createBlogpost (@ModelAttribute BlogPost blogPost) {
        blogRepo.save(blogPost);
        return "redirect:/forum";
    }

//    @GetMapping("/forum/{blogposts.id}")
//    public String viewBlogpost (Model model, @PathVariable Long id){
//        BlogPost blogPost = blogRepo.findById(id).orElse(null);
//        model.addAttribute("blogpost",blogPost);
//        return "forum";
//    }

}
