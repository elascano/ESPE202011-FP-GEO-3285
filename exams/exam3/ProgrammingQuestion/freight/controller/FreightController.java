/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.freight.controller;

import ec.edu.espe.freight.model.Freight;
import utils.FileManager;

/**
 *
 * @author qwe
 */
public class FreightController {
    
    public void save(Freight freight){
        String data = freight.getTypes() + ";" + freight.getCosts() + ";" + freight.getCity() + ";" + freight.getPlaceOfArrival() + "; " + freight.getTime();
        FileManager.save(data, "Freight");
    }
    
    public String read(){
        String data;
        data = FileManager.read("Freight.csv");
        return data;
    }
    
}


