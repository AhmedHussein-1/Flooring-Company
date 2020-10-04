/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.FloorCompany.dao;

import com.sg.FloorCompany.dto.Flooring;
import java.util.List;

/**
 *
 * @author Maxka
 */
public interface FloorCompanyDao {
    
//    Flooring getMenuSelection();
    List<Flooring> displayAllOrder() throws FloorCompanyDaoException;
    Flooring addOrder(int orderNumber) throws FloorCompanyDaoException;
    Flooring editOrder(int orderNumber) throws FloorCompanyDaoException;
    Flooring removeOrder(int orderNumber) throws FloorCompanyDaoException;
    
    
}
