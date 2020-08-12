package dao;

import dao.GenericDAO;
import domain.Poco;
import java.util.List;

public class PocoDAO extends GenericDAO<Poco> {

    public List<Poco> findAll() {
        return super.findAll(Poco.class);
    }
}
