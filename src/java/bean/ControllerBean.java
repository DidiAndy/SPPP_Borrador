/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
/**
 *
 * @author
 */
@ManagedBean(name="controllerBean")
@SessionScoped
public class ControllerBean {
   
    java.util.Date data;
       java.util.Date time;
      private String console;

      private String fecha;
      private String hora;
 
    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
   
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
      
      
      public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
     
  public void imprimirData(){
      
        FacesContext facesContext = FacesContext.getCurrentInstance();
                facesContext.addMessage(null, new FacesMessage("La fecha debe ser de Lunes a Viernes"));
      System.out.println("hola  "+data);
      
  }
    /** evento para fecha seleccionado de agregar cita*/
  public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Fecha Seleccionada", format.format(event.getObject())));
   }
   /** convertir fecha en dias de la semana agregar cita*/
  public void agregar(){
	int dia;
 FacesContext context = FacesContext.getCurrentInstance();    
 SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
   
 GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(data);
        dia=cal.get(Calendar.DAY_OF_WEEK);
        if(dia==1){
                context.addMessage(null, new FacesMessage("La fecha debe ser de Lunes a Viernes"));
        }
        if(dia==7){
                context.addMessage(null, new FacesMessage("La fecha debe ser de Lunes a Viernes"));
               
        }
        
        if(dia==2){
                context.addMessage(null, new FacesMessage("Cita previa agendada"));
              
        }
        
        if(dia==3){
                context.addMessage(null, new FacesMessage("Cita previa agendada"));
            }
        if(dia==4){
                context.addMessage(null, new FacesMessage("Cita previa agendada"));
            }
        if(dia==5){
                context.addMessage(null, new FacesMessage("Cita previa agendada"));
                    }
        if(dia==6){
                context.addMessage(null, new FacesMessage("Cita previa agendada"));
               
        }
        }
  
  
}
  


