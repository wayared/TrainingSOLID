/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.solirius.training.oop.solid.singleresponsibility;

import com.solirius.training.oop.payment.Card;
import com.solirius.training.oop.products.Product;

/**
 *
 * @author Jurgen
 */
public class cardVerification {
    
    
    public boolean verifyCard(Card card, Product selectedProduct) {
        if (card.getBalance() > selectedProduct.getPrice()) {
            return true;
        }
        return false;
    }
    
}
