package pe.edu.utp.hrserviceapp.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrupoUTP on 10/06/2016.
 */
public class CountriesEntity extends BaseEntity{
    private static String DEFAULT_QUERY = "SELECT * FROM countries";

    public List<Country> findAll() {
        String query = DEFAULT_QUERY;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            List<Country> countries = new ArrayList<>();
            while(rs.next()) {
                Country country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
                countries.add(country);
            }
            return countries;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Country findById(String id) {
        String query = DEFAULT_QUERY + " where country_id = " + id;
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            if(rs.next()) {
                Country country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
                return country;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Country findByName(String name) {
        String query = DEFAULT_QUERY + " where country_name = " +
                "'" + name +"'";
        try {
            ResultSet rs = getConnection().createStatement()
                    .executeQuery(query);
            if(rs == null) {
                return null;
            }
            if(rs.next()) {
                Country country = new Country(
                        rs.getString("country_id"),
                        rs.getString("country_name"),
                        rs.getInt("region_id")
                );
                return country;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
