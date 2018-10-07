/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacione;

/**
 *
 * @author Laboratorio
 */
public class Dados {
    
    private static Dados instancia;
    private java.util.List<Cliente> lstClientes;
    private java.util.List<Carro> lstCarros;
    
    private Dados(){
        System.out.println("teste");
        lstClientes = new java.util.LinkedList<>();
        lstCarros = new java.util.LinkedList<>();
    }
    
    public static Dados getInstance(){
        if(instancia==null)
            instancia = new Dados();
        
        return instancia;
    }
    
    public java.util.List<Cliente> getListClientes(){
        return lstClientes;
    }
    
    public java.util.List<Carro> getListCarros() {
        return lstCarros;
    }
}
