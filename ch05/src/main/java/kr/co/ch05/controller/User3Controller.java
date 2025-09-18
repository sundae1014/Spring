package kr.co.ch05.controller;

import kr.co.ch05.dto.User3DTO;
import kr.co.ch05.service.User3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User3Controller {

    private final User3Service service;

    @GetMapping("/user3/register")
    public String register(){
        return "/user3/register";
    }

    @PostMapping("/user3/register")
    public String register(User3DTO user3DTO){
        service.regist(user3DTO);

        return "redirect:/user3/list";
    }

    @GetMapping("/user3/modify")
    public String modify(@RequestParam("user_id") String user_id, Model model){

        User3DTO user3DTO = service.findById(user_id);

        model.addAttribute(user3DTO);

        return "/user3/modify";
    }

    @PostMapping("/user3/modify")
    public String modify(User3DTO user3DTO){
        service.modify(user3DTO);
        return "redirect:/user3/list";
    }

    @GetMapping("/user3/list")
    public String list(Model model){
        List<User3DTO> dtoList = service.findAll();
        model.addAttribute("dtoList", dtoList);
        return "/user3/list";
    }

    @GetMapping("/user3/delete")
    public String delete(String user_id){
        service.remove(user_id);
        return "redirect:/user3/list";
    }
}
