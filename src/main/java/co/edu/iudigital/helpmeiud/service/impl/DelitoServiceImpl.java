package co.edu.iudigital.helpmeiud.service.impl;


import co.edu.iudigital.helpmeiud.dto.DelitoDto;
import co.edu.iudigital.helpmeiud.model.Delito;
import co.edu.iudigital.helpmeiud.repository.IDelitoRepository;
import co.edu.iudigital.helpmeiud.service.iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DelitoServiceImpl implements IDelitoService {
    private final IDelitoRepository delitoRepository;

    @Autowired
    public DelitoServiceImpl(IDelitoRepository delitoRepository){
        this.delitoRepository = delitoRepository;
    }


    /**
     * @return
     */
    @Transactional(readOnly = true)
    @Override
    public List<DelitoDto> findAll() {
        List<Delito> delitos = delitoRepository.findAll();
        // TODO: Refactoring a un mapper en paquete util
        return delitos.stream().map(d ->
                DelitoDto.builder()
                        .id(d.getId())
                        .nombre(d.getNombre())
                        .descripcion(d.getDescripcion())
                        .build()
        ).collect(Collectors.toList());
    }

    /**
     * @param id
     * @return
     */
    @Override
    public DelitoDto findById(Long id) {
        return null;
    }

    /**
     * @param delitoDTO
     * @return
     */
    @Override
    public DelitoDto save(DelitoDto delitoDTO) {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }
}
