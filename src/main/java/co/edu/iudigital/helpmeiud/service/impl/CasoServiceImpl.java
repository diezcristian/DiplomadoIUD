package co.edu.iudigital.helpmeiud.service.impl;

import co.edu.iudigital.helpmeiud.dto.CasoDto;
import co.edu.iudigital.helpmeiud.exception.BadRequestException;
import co.edu.iudigital.helpmeiud.exception.ErrorDto;
import co.edu.iudigital.helpmeiud.exception.RestException;
import co.edu.iudigital.helpmeiud.model.Caso;
import co.edu.iudigital.helpmeiud.repository.ICasoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CasoServiceImpl {
    private ICasoRepository casoRepository;

    public List<CasoDto> findAll() throws RestException {
        List<Caso> casos = casoRepository.findAll();
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

    public Caso save(Caso caso) throws RestException {
        if(Objects.isNull(caso)) {
            throw new BadRequestException(ErrorDto.getErrorDto(
                    HttpStatus.BAD_REQUEST.getReasonPhrase(),
                    "Mala petición",
                    HttpStatus.BAD_REQUEST.value())
            );
        }
        return casoRepository.save(caso);
    }


    public Boolean visible(Boolean visible, Long id) throws RestException {
        return casoRepository.setVisible(visible, id);
    }

    @Transactional(readOnly = true)

    public Caso findById(Long id) throws RestException {
        return casoRepository.findById(id).get();
    }

}
