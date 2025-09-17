package kr.co.ch05.controller;

import kr.co.ch05.dto.User3DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class User3Controller {

    @GetMapping("/user3/register")
    public String register(){
        return "/user3/register";
    }

    @PostMapping("/user3/register")
    public String register(User3DTO user3DTO){
        return "/user3/register";
    }

    @GetMapping("/user3/modify")
    public String modify(){
        return "/user3/modify";
    }

    @PostMapping("/user3/modify")
    public String modify(String user_id, Model model){

        model.addAttribute(user_id);
        return "redirect:/user3/modify";
    }

    @GetMapping("/user3/list")
    public String list(){
        return "/user3/list";
    }

    @GetMapping("/user3/delete")
    public String delete(){
        return "redirect:/user3/list";
    }
}
