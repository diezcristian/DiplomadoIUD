package co.edu.iudigital.helpmeiud.controller;

import co.edu.iudigital.helpmeiud.model.Role;
import co.edu.iudigital.helpmeiud.service.iface.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> index(){
        List<Role> roles = roleService.getAll();
        return ResponseEntity.ok().body(roles);
    }

}
