package pe.edu.utp.hrserviceapp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;

/**
 * Created by GrupoUTP on 11/06/2016.
 */
public class ServiceBean implements Serializable{
    HRService service;
    InitialContext context=null;
    public ServiceBean(){
        try{
            context = new InitialContext();
            service = new HRService(context);
        }catch (NamingException e){
            e.printStackTrace();
        }
    }

    public int getRegionsCount(){
        return service.findAllRegion().size();
    }

    public int getCountriesCount(){
        return service.findAllCountries().size();
    }

    //Utilizando Service Bean, presentar la relacion de regiones
}

