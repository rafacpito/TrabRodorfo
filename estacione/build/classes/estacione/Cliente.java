/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacione;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;

/**
 *
 * @author Laboratorio
 */
public class Cliente implements Cloneable {
    
    public Cliente getClone(){
        try{
            return (Cliente)this.clone();
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

    private Date dataNasc;

    public static final String PROP_DATANASC = "dataNasc";

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        Date oldDataNasc = this.dataNasc;
        this.dataNasc = dataNasc;
        propertyChangeSupport.firePropertyChange(PROP_DATANASC, oldDataNasc, dataNasc);
    }

    private char sexo;

    public static final String PROP_SEXO = "sexo";

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        char oldSexo = this.sexo;
        this.sexo = sexo;
        propertyChangeSupport.firePropertyChange(PROP_SEXO, oldSexo, sexo);
    }

    private String cidade;

    public static final String PROP_CIDADE = "cidade";

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        propertyChangeSupport.firePropertyChange(PROP_CIDADE, oldCidade, cidade);
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
        return nome;
    }

}
