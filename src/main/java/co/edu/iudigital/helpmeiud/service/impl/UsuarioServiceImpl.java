package co.edu.iudigital.helpmeiud.service.impl;

import co.edu.iudigital.helpmeiud.dto.UsuarioDto;
import co.edu.iudigital.helpmeiud.model.Usuario;
import co.edu.iudigital.helpmeiud.repository.IUsuarioRepository;
import co.edu.iudigital.helpmeiud.service.iface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;


    /**
     * @return
     */
    @Override
    public List<UsuarioDto> findAll() {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public UsuarioDto findById(Long id) {
        return null;
    }

    /**
     * @param usuarioDTO
     * @return
     */
    @Override
    public UsuarioDto save(UsuarioDto usuarioDTO) {
        return null;
    }

    /**
     * @param name
     * @return
     */
    @Override
    public Usuario findByUsername(String name) {
        return null;
    }
}
