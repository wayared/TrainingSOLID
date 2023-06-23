/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class BasicPurchaseBehavior implements PurchaseBehavior {
    public Product purchaseProduct(MultiValuedMap<StockType, Product> stock, StockType stockType, Double cash)
            throws OutOfStockException, InsufficientPaymentException {

        Product selectedProduct = stock.get(stockType)
                .stream()
                .findFirst()
                .orElseThrow(() -> new OutOfStockException());

        if (cash < selectedProduct.getPrice()) {
            throw new InsufficientPaymentException();
        }

        stock.get(stockType).remove(selectedProduct);

        return selectedProduct;
    }
}