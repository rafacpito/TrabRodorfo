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
public class Carro  implements Cloneable{

    public Carro getClone(){
        try{
            return (Carro)this.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
    
    private String marca;

    public static final String PROP_MARCA = "marca";

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        String oldMarca = this.marca;
        this.marca = marca;
        propertyChangeSupport.firePropertyChange(PROP_MARCA, oldMarca, marca);
    }
    
    private String modelo;

    public static final String PROP_MODELO = "modelo";

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        String oldModelo = this.modelo;
        this.modelo = modelo;
        propertyChangeSupport.firePropertyChange(PROP_MODELO, oldModelo, modelo);
    }

    private int ano;

    public static final String PROP_ANO = "ano";

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        int oldAno = this.ano;
        this.ano = ano;
        propertyChangeSupport.firePropertyChange(PROP_ANO, oldAno, ano);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
    @Override
    public String toString(){
        return marca + ' ' + modelo + ' ' + ano;
    }

}
