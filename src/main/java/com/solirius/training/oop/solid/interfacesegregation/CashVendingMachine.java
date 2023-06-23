/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solirius.training.oop.solid.interfacesegregation;

import com.solirius.training.oop.exception.CardPaymentsNotSupported;
import com.solirius.training.oop.exception.CashPaymentsNotSupportedException;
import com.solirius.training.oop.exception.InsufficientPaymentException;
import com.solirius.training.oop.exception.OutOfStockException;
import com.solirius.training.oop.products.Product;
import com.solirius.training.oop.products.StockType;
import org.apache.commons.collections4.MultiValuedMap;

/**
 *
 * @author Jurgen
 */
public interface CashVendingMachine{
    
     Double getCashBalance() throws CashPaymentsNotSupportedException;
     
     void stockUp(MultiValuedMap<StockType, Product> stock);

     MultiValuedMap<StockType, Product> getStock();

    Product purchaseProduct(StockType stockType, Double cash)
        throws CardPaymentsNotSupported, OutOfStockException, InsufficientPaymentException;
}
