package model;

import control.CurrencyObtainer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author edwin
 */
public class MoneyCalculator {
    
    
    public double getCorrespondance(String firstCurrency, String secondCurrency){
        ArrayList<Currency> currencies = new CurrencyObtainer().getCurrencies();
        try{
            for(Currency currency:currencies){
                if(currency.getName().equals(firstCurrency)){
                    firstCurrency = currency.getCode();
                }if(currency.getName().equals(secondCurrency)){
                    secondCurrency = currency.getCode();
                }
            }
        }catch(Exception e){}
        double result = 0;
        try{
            URL requestURL = new URL("https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/" + 
                    firstCurrency +"/"+ secondCurrency + ".json");
            HttpURLConnection con = (HttpURLConnection) requestURL.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine = "";
            for (int i = 0; i < 3; i++){
                inputLine = in.readLine();
            }
            result = Double.parseDouble(inputLine.split(":")[1]);
            con.disconnect();
        }
        catch(Exception e){}
        return result;
    }
    
    
}
