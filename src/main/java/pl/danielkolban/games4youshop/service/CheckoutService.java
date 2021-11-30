package pl.danielkolban.games4youshop.service;


import pl.danielkolban.games4youshop.dto.Purchase;
import pl.danielkolban.games4youshop.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
