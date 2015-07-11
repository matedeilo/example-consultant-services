package ws.dao;

import io.spring.guides.gs_producing_web_service.Asesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ws.models.Sede;
import ws.repository.AsesorRepository;

@Component
public class AsesorDAO {

    @Autowired
    private AsesorRepository asesorRepository;

    public Asesor findAsesor(String name) {
        Asesor result = null;

//        for (Country country : countries) {
//            if (name.equals(country.getName())) {
//                result = country;
//            }
//        }
        ws.models.Asesor asesorDB = asesorRepository.findByNombre(name);

        result = new Asesor();
        result.setCodigo(asesorDB.getCodigo());
        result.setNombre(asesorDB.getNombre());
        return result;
    }

    public void createAsesor(Asesor asesor){
        ws.models.Asesor asesor1 = new ws.models.Asesor();
        Sede sede = new Sede();
        sede.setId(asesor.getSede().getCodigo());
        sede.setNombre(asesor.getSede().getNombre());
        asesor1.setCodigo(asesor.getCodigo());
        asesor1.setCorreo(asesor.getCorreo());
        asesor1.setNombre(asesor.getNombre());
        asesor1.setSede(sede);
        asesorRepository.save(asesor1);
    }

    public void updateAsesor(Asesor asesor){
        ws.models.Asesor asesor1 = asesorRepository.findByNombre(asesor.getNombre());
        asesor1.setCodigo(asesor.getCodigo());
        asesor1.setCorreo(asesor.getCorreo());
        asesor1.setNombre(asesor.getNombre());
        asesorRepository.save(asesor1);
    }

    public void deleteAsesor(int id){
        asesorRepository.delete(id);
    }

}
