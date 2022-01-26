/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Currency;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public class CurrencyObtainer {
    private ArrayList<Currency> currencies = new ArrayList<Currency>();
    
    public ArrayList<Currency> getCurrencies(){
            
        try{        
            String defaultFile = "C:\\Users\\edwin\\OneDrive\\Documentos\\NetBeansProjects"
                        + "\\MoneyCalculator\\src\\data.txt";
            BufferedReader br = new BufferedReader(new FileReader(defaultFile));
            String line;
            while ((line = br.readLine()) != null) {
                String[] vec = line.split(",");
                currencies.add(new Currency(vec[0].strip(), vec[1].strip(), vec[2].strip()));
            }           
        }catch(Exception e){
            System.exit(1);
        }
        return currencies;
    }
}
