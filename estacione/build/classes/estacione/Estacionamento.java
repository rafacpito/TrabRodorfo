/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacione;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Laboratorio
 */
public class Estacionamento {
    public Estacionamento getClone(){
        try{
            return (Estacionamento)this.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
    
    private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }
    
    private String cnpj;

    public static final String PROP_CNPJ = "cnpj";

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        propertyChangeSupport.firePropertyChange(PROP_CNPJ, oldCnpj, cnpj);
    }
    
    private int espacos;

    public static final String PROP_ESPACOS = "espacos";

    public int getEspacos() {
        return espacos;
    }

    public void setEspacos(int espacos) {
        int oldEspacos = this.espacos;
        this.espacos = espacos;
        propertyChangeSupport.firePropertyChange(PROP_ESPACOS, oldEspacos, espacos);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
