package ws.endpoint;

import io.spring.guides.gs_producing_web_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import ws.dao.AsesorDAO;

@Endpoint
public class AsesorEndpoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private AsesorDAO asesorDAO;

    @Autowired
    public AsesorEndpoint(AsesorDAO asesorDAO) {
        this.asesorDAO = asesorDAO;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAsesorRequest")
    @ResponsePayload
    public GetAsesorResponse getAsesor(@RequestPayload GetAsesorRequest request) {
        GetAsesorResponse response = new GetAsesorResponse();
        response.setAsesor(asesorDAO.findAsesor(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createAsesorRequest")
    @ResponsePayload
    public void createAsesor(@RequestPayload CreateAsesorRequest request) {
       asesorDAO.createAsesor(request.getAsesor());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateAsesorRequest")
    @ResponsePayload
    public void updateAsesor(@RequestPayload UpdateAsesorRequest request) {
        asesorDAO.updateAsesor(request.getAsesor());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteAsesorRequest")
    @ResponsePayload
    public void deleteAsesor(@RequestPayload DeleteAsesorRequest request) {
        asesorDAO.deleteAsesor(request.getCodigo());
    }

}