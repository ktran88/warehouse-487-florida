/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author Zearf
 */
public class Warehouse {
    public static final int MIN_TRESHOLD_TRIGGER = 20;
    private String name;
    private String zip;
    private List<ManufactureItem> inventory;
    private static Warehouse instance;
    protected Warehouse(){}
    public static Warehouse getInstance()
    {
        if(instance==null)
        {
            Warehouse ins = new Warehouse();
            ins.name = "Miami Warehouse";
            ins.zip = "33010";
            ins.inventory = new ArrayList<ManufactureItem>();
            instance = ins;
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public List<ManufactureItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<ManufactureItem> inventory) {
        this.inventory = inventory;
    }

    
    
}
