/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sppp.beans;

import dao.FormatosDao;
import imp.FormatosDaoImp;
import java.util.ArrayList;

import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import model.TbPreguntas;

/**
 *
 * @author DidiAndy
 */
@ManagedBean
@RequestScoped
public class FormatosBean {

   private List<SelectItem> listPreguntas; 
   private TbPreguntas preguntas;
   
    public FormatosBean() {
        preguntas=new TbPreguntas();
    }

    public TbPreguntas getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(TbPreguntas preguntas) {
        this.preguntas = preguntas;
    }

    public List<SelectItem> getListPreguntas() {
        this.listPreguntas= new ArrayList<SelectItem>();
        FormatosDao preguntasDao = new FormatosDaoImp();
        
        List<TbPreguntas> p =preguntasDao.listaPreguntas();
        listPreguntas.clear();
        
        for(TbPreguntas preguntasf: p){
            SelectItem preguntasItem = new SelectItem(preguntasf.getIdPreguntas(),preguntasf.getDescripcion());
                    this.listPreguntas.add(preguntasItem);
            
        }
        return listPreguntas;
    }
    
    
}
