package main.ua.alvin.service;

import main.ua.alvin.dao.TablesDAO;
import main.ua.alvin.entity.BillTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TariffsTableService implements TableService{

    @Autowired
    private TablesDAO tablesDAO;

    @Override
    public void save(BillTable billTable) {

    }
}
