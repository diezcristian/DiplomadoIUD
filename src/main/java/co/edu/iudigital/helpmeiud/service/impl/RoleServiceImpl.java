package co.edu.iudigital.helpmeiud.service.impl;

import co.edu.iudigital.helpmeiud.model.Role;
import co.edu.iudigital.helpmeiud.repository.IRoleRepository;
import co.edu.iudigital.helpmeiud.service.iface.IRoleService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired // inyección de dependencias
    private IRoleRepository roleRepository;

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
