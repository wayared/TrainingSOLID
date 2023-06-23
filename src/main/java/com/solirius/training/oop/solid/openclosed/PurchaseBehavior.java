/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solirius.training.oop.solid.openclosed;

import com.solirius.training.oop.exception.InsufficientPaymentException;
import com.solirius.training.oop.exception.OutOfStockException;
import com.solirius.training.oop.products.Product;
import com.solirius.training.oop.products.StockType;
import org.apache.commons.collections4.MultiValuedMap;

/**
 *
 * @author wayar
 */
public interface PurchaseBehavior {
    Product purchaseProduct(MultiValuedMap<StockType, Product> stock, StockType stockType, Double cash)
            throws OutOfStockException, InsufficientPaymentException;
}

