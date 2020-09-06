package main.ua.alvin.dao;

import main.ua.alvin.entity.BillTable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
public class TablesDAOImpl implements TablesDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(BillTable billTable) {

//        System.out.println("sessionFactory " + sessionFactory);

//        Session session = sessionFactory.getCurrentSession();
//
//        System.out.println("session " + session);
//
//        session.saveOrUpdate(billTable);


        System.out.println("TablesDAOImpl save()" + billTable.getClass());


    }
}
