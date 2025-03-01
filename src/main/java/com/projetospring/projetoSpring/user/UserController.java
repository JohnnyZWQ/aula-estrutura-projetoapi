package com.projetospring.projetoSpring.user;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/novo")
    private UserModel criar(@RequestBody UserModel user, HttpServletRequest request) {
        System.out.println("TESTE O SISTEMA CHEGOU AQUI");
        var criado = this.userRepository.save(user);
        return criado;
    }

    @GetMapping("/teste")
    public String testar() {
        return "API está rodando!";
    }

}
