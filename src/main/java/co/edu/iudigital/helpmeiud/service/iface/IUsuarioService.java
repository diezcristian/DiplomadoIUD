package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.UsuarioDto;
import co.edu.iudigital.helpmeiud.exception.RestException;
import co.edu.iudigital.helpmeiud.model.Usuario;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUsuarioService {

    public List<UsuarioDto> findAll();

    public UsuarioDto findById(Long id);

    public UsuarioDto save(UsuarioDto usuarioDTO);

    public Usuario findByUsername(String name);

    @Transactional(readOnly = true)
    List<UsuarioDto> listUsers() throws RestException;

    @Transactional(readOnly = true)
    Usuario listUser(Long id) throws RestException;

    @Transactional
    Usuario saveUser(Usuario usuario) throws RestException;

    @Transactional(readOnly = true)
    Usuario listByUsername(String username);

    @Transactional
    Usuario updateUser(Usuario usuario) throws RestException;
}
