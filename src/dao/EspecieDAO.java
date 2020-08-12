package dao;

import domain.Especie;
import java.util.List;

public class EspecieDAO extends GenericDAO<Especie> {
    
    public List<Especie> findAll() {
        return super.findAll(Especie.class);
    }
}
