package co.edu.iudigital.helpmeiud.service.impl;

import co.edu.iudigital.helpmeiud.dto.CasoDto;
import co.edu.iudigital.helpmeiud.model.Caso;
import co.edu.iudigital.helpmeiud.repository.ICasoRepository;
import co.edu.iudigital.helpmeiud.service.iface.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
public class CasoServiceImpl implements ICasoService {

    @Autowired
    private ICasoRepository casoRepository;



    /**
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public List<CasoDto> findAll() {
        List<Caso> casos = casoRepository.findAll();
        // TODO: Refactorizar con mapeo
        List<CasoDto> casosDto = new ArrayList<>();
        casos.stream().forEach(c -> {
            CasoDto casoDto = new CasoDto();
            casoDto.setId(c.getId());
            casoDto.setFechaHora(c.getFechaHora());
            casoDto.setLatitud(c.getLatitud());
            casoDto.setLongitud(c.getLongitud());
            casoDto.setVisible(c.getVisible());
            casoDto.setDescripcion(c.getDescripcion());
            casoDto.setUrlMap(c.getUrlMap());
            casoDto.setRmiUrl(c.getRmiUrl());
            casoDto.setUsuarioId(c.getUsuario().getId());
            casoDto.setImage(c.getUsuario().getImage());
            casoDto.setNombre(c.getUsuario().getNombre());
            casosDto.add(casoDto);
        });
        return casosDto;
    }

    /**
     * @param casoDTO
     * @return
     */
    @Override
    public CasoDto save(CasoDto casoDTO)  {

        return null;
    }

    /**
     * @param visible
     * @param id
     * @return
     */
    @Override
    public Boolean visible(Boolean visible, Long id) {
        return null;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public CasoDto findById(Long id) {
        return null;
    }
}
