/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacione;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author Laboratorio
 */
public class ConversorDateString extends Converter<Date, String>{

    private SimpleDateFormat df;
    public ConversorDateString(){
        df = new SimpleDateFormat("dd/MM/yyyy");
    }
    
    @Override
    public String convertForward(Date value) {
        return df.format(value);
    }

    @Override
    public Date convertReverse(String value) {
        try{
            return df.parse(value);
        }
        catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Data inválida",
                                                "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
