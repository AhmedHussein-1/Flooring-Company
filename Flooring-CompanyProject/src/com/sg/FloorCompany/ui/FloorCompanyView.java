/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.ui;

import com.sg.FloorCompany.dto.Flooring;
import java.math.BigDecimal;

/**
 *
 * @author Maxka
 */
public class FloorCompanyView {
    
    public FloorCompanyView(UserIO io) {
        this.io = io;
    }
    
    private UserIO io;
    
    public int printMenuAndGetSelection() {
        io.print("<<Flooring Program>>");
        io.print("1. Display Orders");
        io.print("2. Add an Order");
        io.print("3. Edit an Order");
        io.print("4. Remove an Order");
        io.print("5. Export All Data");
        io.print("6. Quit");
        
        return io.readInt("Please select from the"
                    + " above choices.", 1, 6);
    }
    
    public void displayFloorList() {
        
    }
    
    public Flooring addNewOrderInfo() {
        int dateEntry = io.readInt("Please Enter Date: MMDDYYYY");
        String nameEntry = io.readString("Please Enter Your Name: ");
        String stateEntry = io.readString("Please Enter Your State Abbreviation: ");
        String productEntry = io.readString("Please Enter Product Type: ");
        BigDecimal areaEntry = io.readBigDecimal("Please Enter Area: ");
        
        Flooring currentOrder = new Flooring(dateEntry);
        currentOrder.setCustomerName(nameEntry);
        currentOrder.setState(stateEntry);
        currentOrder.setProductType(productEntry);
        currentOrder.setArea(areaEntry);
        
        return currentOrder;
    }
}
