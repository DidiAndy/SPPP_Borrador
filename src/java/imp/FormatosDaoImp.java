/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp;

import dao.FormatosDao;
import java.util.List;
import model.TbPreguntas;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author DidiAndy
 */
public class FormatosDaoImp implements FormatosDao{

    @Override
    public List<TbPreguntas> listaPreguntas() {
        List<TbPreguntas> listarPreguntas=null;
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        
        String hql="from TbPreguntas where id_formato = 1";
        
        try {
            listarPreguntas= session.createQuery(hql).list();
            t.commit();
            session.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            t.rollback();
        }
        
        return listarPreguntas;
        
    }
    
}
