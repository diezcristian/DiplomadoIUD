package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.DelitoDto;

import java.util.List;

public interface IDelitoService {
    // listar todos los delitos
    public List<DelitoDto> findAll();//TODO: Lanzar Excepcion personalizadas

    // listar un delito por ID
    public DelitoDto findById(Long id);//TODO: Lanzar Excepcion personalizadas

    // guardar un delito
    public DelitoDto save(DelitoDto delitoDTO);//TODO: Lanzar Excepcion personalizadas

    // borrar un delito por ID
    public void delete(Long id);//TODO: Lanzar Excepcion personalizadas
}
