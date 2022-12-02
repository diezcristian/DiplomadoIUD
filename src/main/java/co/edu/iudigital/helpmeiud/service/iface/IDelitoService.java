package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.DelitoDto;
import java.util.List;

public interface IDelitoService {

    public List<DelitoDto> findAll();

    public DelitoDto findById(Long id);

    public DelitoDto save(DelitoDto delitoDTO);

    public void delete(Long id);


}
