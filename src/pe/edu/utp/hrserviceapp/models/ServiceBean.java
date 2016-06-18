package pe.edu.utp.hrserviceapp.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.Serializable;
import java.util.List;

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

    public List<Region> getAllRegions() { return service.findAllRegion();}

    public List<Country> getAllCountries() { return service.findAllCountries();}

    //Utilizando Service Bean, presentar la relacion de regiones
}

