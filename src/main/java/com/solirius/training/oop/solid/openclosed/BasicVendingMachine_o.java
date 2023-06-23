package com.solirius.training.oop.solid.openclosed;

import com.solirius.training.oop.exception.InsufficientPaymentException;
import com.solirius.training.oop.exception.OutOfStockException;
import com.solirius.training.oop.products.Product;
import com.solirius.training.oop.products.StockType;
import org.apache.commons.collections4.MultiValuedMap;

public class BasicVendingMachine_o {

    /* The problem is that this class is open to modification.
    This is a violation of the open closed principle. */

    private MultiValuedMap<StockType, Product> stock;
    private Double storedCash;
    private PurchaseBehavior purchaseBehavior;

    public BasicVendingMachine_o(MultiValuedMap<StockType, Product> stock, PurchaseBehavior purchaseBehavior) {
        this.stock = stock;
        this.storedCash = 0.0;
        this.purchaseBehavior = purchaseBehavior;
    }

    public Product purchaseProduct(StockType stockType, Double cash)
            throws OutOfStockException, InsufficientPaymentException {
        return purchaseBehavior.purchaseProduct(stock, stockType, cash);
    }

    public void stockUp(MultiValuedMap<StockType, Product> stock) {
        this.stock = stock;
    }

    public MultiValuedMap<StockType, Product> getStock() {
        return stock;
    }

    public Double getCashBalance() {
        return storedCash;
    }

}


