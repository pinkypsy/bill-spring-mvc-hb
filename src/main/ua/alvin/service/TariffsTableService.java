package main.ua.alvin.service;

import main.ua.alvin.dao.TablesDAO;
import main.ua.alvin.entity.BillTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TariffsTableService implements TableService{

    @Autowired
    private TablesDAO tablesDAO;
//    private TablesDAO tablesDAO = new TablesDAOImpl();


    @Transactional
    @Override
    public void save(BillTable billTable) {
        System.out.println("tablesDAO " + tablesDAO);

        tablesDAO.save(billTable);

    }
}
