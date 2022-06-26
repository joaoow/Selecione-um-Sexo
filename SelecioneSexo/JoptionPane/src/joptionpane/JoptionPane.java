/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author João Renis
 */
public class JoptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo:\n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE, null, op, "Masculino");
        
        if (resp == null){
            JOptionPane.showMessageDialog(null, "Você pressionou cancel");
        }
        
        if (resp == "Masculino"){
            JOptionPane.showMessageDialog(null, "Você é homem");
        }
        
        if (resp == "Feminino"){
            JOptionPane.showMessageDialog(null, "Você é mulher");
    }
        System.exit(0);

}
}
