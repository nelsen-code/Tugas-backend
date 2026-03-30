package Jpa.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import Jpa.model.Role;
import Jpa.repository.RoleRepo;

@RestController
@RequestMapping("/roles")
public class RoleControll {

    private final RoleRepo roleRepository;

    public RoleControll(RoleRepo roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @GetMapping
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}