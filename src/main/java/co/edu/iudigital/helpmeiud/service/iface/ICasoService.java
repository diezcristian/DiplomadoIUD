package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.CasoDto;
import java.util.List;

public interface ICasoService {
    // consultar todos los casos
    public List<CasoDto> findAll();//TODO: Lanzar Excepcion personalizadas

    // crear un caso
    public CasoDto save(CasoDto casoDTO);//TODO: Lanzar Excepcion personalizadas

    // activar/inactivar caso
    //TODO: Lanzar Excepcion personalizadas
    public Boolean visible(Boolean visible, Long id);

    // consultar caso por ID
    //TODO: Lanzar Excepcion personalizadas
    public CasoDto findById(Long id);
}