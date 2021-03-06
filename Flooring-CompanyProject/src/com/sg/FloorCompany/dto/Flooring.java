/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dto;

import java.math.BigDecimal;

/**
 *
 * @author Maxka
 */
public class Flooring {
    
    private int orderNumber;
    private String customerName;
    private String state;
    private BigDecimal taxRate;
    private String productType;
    private BigDecimal area;
    private BigDecimal costPerSquareFoot;
    private BigDecimal laborCostPerSquareFoot;
    private BigDecimal materialCost;
    private BigDecimal laborCost;
    private BigDecimal tax;
    private BigDecimal total;
    
    public Flooring(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getState(){
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public BigDecimal getTaxRate(){
        return taxRate;
    }
    
    public void setTaxRate(BigDecimal taxRate){
        this.taxRate = taxRate;        
    }
    
    public String getProductType(){
        return productType;
    }
    
    public void setProductType(String productType){
        this.productType = productType;
    }
    
    public BigDecimal getArea(){
        return area;
    }
    
    public void setArea(BigDecimal area){
        this.area = area;
    }
    
    public BigDecimal getCostPerSquareFoot(){
        return costPerSquareFoot;
    }
    
    public void setCostPerSquareFoot(BigDecimal costPerSquareFoot){
        this.costPerSquareFoot = costPerSquareFoot;
    }
    
    public BigDecimal getLaborCostPerSquareFoot(){
        return laborCostPerSquareFoot;
    }
    
    public void setLaborCostPerSquareFoot(BigDecimal laborCostPerSquareFoot){
        this.laborCostPerSquareFoot = laborCostPerSquareFoot;
    }
    
    public BigDecimal getMatericalCost(){
        return materialCost;
    }
    
    public void setMaterialCost(BigDecimal materialCost){
        this.materialCost = materialCost;
    }
    
    public BigDecimal getLaborCost(){
        return laborCost;
    }
    
    public void setLaborCost(BigDecimal laborCost){
        this.laborCost = laborCost;
    }
    
    public BigDecimal getTax(){
        return tax;
    }
    
    public void setTax(BigDecimal tax){
        this.tax = tax;
    }
    
    public BigDecimal getTotal(){
        return total;
    }
    
    public void setTotal(BigDecimal total){
        this.total = total;
    }


}
