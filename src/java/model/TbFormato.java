package model;
// Generated 29/11/2017 14:51:04 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TbFormato generated by hbm2java
 */
public class TbFormato  implements java.io.Serializable {


     private int idFormato;
     private String nombreFormato;
     private Boolean estadoFormato;
     private Set<TbPreguntas> tbPreguntases = new HashSet<TbPreguntas>(0);

    public TbFormato() {
    }

	
    public TbFormato(int idFormato) {
        this.idFormato = idFormato;
    }
    public TbFormato(int idFormato, String nombreFormato, Boolean estadoFormato, Set<TbPreguntas> tbPreguntases) {
       this.idFormato = idFormato;
       this.nombreFormato = nombreFormato;
       this.estadoFormato = estadoFormato;
       this.tbPreguntases = tbPreguntases;
    }
   
    public int getIdFormato() {
        return this.idFormato;
    }
    
    public void setIdFormato(int idFormato) {
        this.idFormato = idFormato;
    }
    public String getNombreFormato() {
        return this.nombreFormato;
    }
    
    public void setNombreFormato(String nombreFormato) {
        this.nombreFormato = nombreFormato;
    }
    public Boolean getEstadoFormato() {
        return this.estadoFormato;
    }
    
    public void setEstadoFormato(Boolean estadoFormato) {
        this.estadoFormato = estadoFormato;
    }
    public Set<TbPreguntas> getTbPreguntases() {
        return this.tbPreguntases;
    }
    
    public void setTbPreguntases(Set<TbPreguntas> tbPreguntases) {
        this.tbPreguntases = tbPreguntases;
    }




}


