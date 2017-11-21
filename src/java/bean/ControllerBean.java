/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author DidiAndy
 */
@ManagedBean(name="controllerBean")
@SessionScoped
public class ControllerBean {
   
    private java.util.Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
     
  public void imprimirData(){
      System.out.println(data);
  }
    
}
