package com.clearlove;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author promise
 * @date 2021/1/31 - 19:30
 */

@SpringBootApplication
@Controller
public class PersonService {
  public static void main(String[] args) {
    SpringApplication.run(PersonService.class, args);
  }

  @ResponseBody
  @GetMapping("/")
  public String hello() {
      Person person = new Person("1","clearlove");
      return person.toString();
  }
}
