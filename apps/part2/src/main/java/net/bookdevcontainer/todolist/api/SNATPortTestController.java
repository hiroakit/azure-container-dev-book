package net.bookdevcontainer.todolist.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RestController;
import net.bookdevcontainer.todolist.api.Repository.User;
import net.bookdevcontainer.todolist.api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/")
public class SNATPortTestController {

  private static final Logger logger = LoggerFactory.getLogger(SNATPortTestController.class);

  @Autowired // This means to get the bean called userRepository
  // Which is auto-generated by Spring, we will use it to handle the data
  private UserRepository userRepository;

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    logger.info("start");

    return userRepository.findAll();
  }
}