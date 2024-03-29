//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.10 at 10:15:49 PM COT 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.spring.guides.gs_producing_web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.spring.guides.gs_producing_web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAsesorRequest }
     * 
     */
    public GetAsesorRequest createGetAsesorRequest() {
        return new GetAsesorRequest();
    }

    /**
     * Create an instance of {@link DeleteAsesorRequest }
     * 
     */
    public DeleteAsesorRequest createDeleteAsesorRequest() {
        return new DeleteAsesorRequest();
    }

    /**
     * Create an instance of {@link UpdateAsesorRequest }
     * 
     */
    public UpdateAsesorRequest createUpdateAsesorRequest() {
        return new UpdateAsesorRequest();
    }

    /**
     * Create an instance of {@link Asesor }
     * 
     */
    public Asesor createAsesor() {
        return new Asesor();
    }

    /**
     * Create an instance of {@link GetAsesorResponse }
     * 
     */
    public GetAsesorResponse createGetAsesorResponse() {
        return new GetAsesorResponse();
    }

    /**
     * Create an instance of {@link CreateAsesorRequest }
     * 
     */
    public CreateAsesorRequest createCreateAsesorRequest() {
        return new CreateAsesorRequest();
    }

    /**
     * Create an instance of {@link Sede }
     * 
     */
    public Sede createSede() {
        return new Sede();
    }

}
