package kr.co.ch05.controller;

import kr.co.ch05.dto.User4DTO;
import kr.co.ch05.service.User4Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User4Controller {

    private final User4Service service;

    @GetMapping("/user4/register")
    public String register(){
        return "/user4/register";
    }

    @PostMapping("/user4/register")
    public String register(User4DTO user4DTO){
        service.regist(user4DTO);

        return "redirect:/user4/list";
    }

    @GetMapping("/user4/modify")
    public String modify(@RequestParam("user_id") String user_id, Model model){

        User4DTO user4DTO = service.findById(user_id);

        model.addAttribute(user4DTO);

        return "/user4/modify";
    }

    @PostMapping("/user4/modify")
    public String modify(User4DTO user4DTO){
        service.modify(user4DTO);
        return "redirect:/user4/list";
    }

    @GetMapping("/user4/list")
    public String list(Model model){
        List<User4DTO> dtoList = service.findAll();
        model.addAttribute("dtoList", dtoList);
        return "/user4/list";
    }

    @GetMapping("/user4/delete")
    public String delete(String user_id){
        service.remove(user_id);
        return "redirect:/user4/list";
    }
}
