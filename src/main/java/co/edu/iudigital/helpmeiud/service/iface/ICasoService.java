package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.CasoDto;
import java.util.List;

public interface ICasoService {
    public List<CasoDto> findAll();

    public CasoDto save(CasoDto casoDTO);

    public Boolean visible(Boolean visible, Long id);

    public CasoDto findById(Long id);
}