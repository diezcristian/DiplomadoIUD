package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.UsuarioDto;

import co.edu.iudigital.helpmeiud.model.Usuario;


import java.util.List;

public interface IUsuarioService {

    public List<UsuarioDto> findAll();//TODO: Lanzar Excepcion personalizadas

    public UsuarioDto findById(Long id);//TODO: Lanzar Excepcion personalizadas

    public UsuarioDto save(UsuarioDto usuarioDTO);//TODO: Lanzar Excepcion personalizadas

    public Usuario findByUsername(String name);//TODO: Lanzar Excepcion personalizadas
}
