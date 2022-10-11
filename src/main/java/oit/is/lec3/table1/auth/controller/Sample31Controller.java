package oit.is.lec3.table1.auth.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sample3")
public class Sample31Controller {
  @GetMapping("step1")
  public String sample31() {
    return "sample31.html";
  }

  @GetMapping("step2")
  public String sample32(ModelMap model, Principal prin) {
    String loginUser = prin.getName(); // ログインユーザ情報
    model.addAttribute("login_user", loginUser);
    return "sample31.html";
  }

  @GetMapping("step3")
  public String sample33() {
    return "sample33.html";
  }

  @PostMapping("step6")
  public String sample36(@RequestParam Integer hiku1, @RequestParam Integer hiku2, ModelMap model) {
    int kekka = hiku1 - hiku2;
    model.addAttribute("hikukekka", kekka);
    return "sample33.html";
  }

  @GetMapping("step7")
  public String sample37() {
    return "sample37.html";
  }
}
