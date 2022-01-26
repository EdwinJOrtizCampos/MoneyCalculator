/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.MoneyCalculator;
import view.Gui;


/**
 *
 * @author edwin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MoneyCalculator calculator = new MoneyCalculator();
        new Gui(calculator).setVisible(true);
        
    }
    
}
