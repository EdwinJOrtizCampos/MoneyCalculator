/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author edwin
 */
public class Currency {
    private String name;
    private String sign;
    private String code;
    
    public Currency(String code, String name, String sign){
        this.name = name;
        this.sign = sign;
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public String getSign() {
        return sign;
    }

    public String getCode() {
        return code;
    }
}
