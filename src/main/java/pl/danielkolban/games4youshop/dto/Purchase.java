package pl.danielkolban.games4youshop.dto;

import lombok.Data;
import pl.danielkolban.games4youshop.model.Address;
import pl.danielkolban.games4youshop.model.Customer;
import pl.danielkolban.games4youshop.model.Order;
import pl.danielkolban.games4youshop.model.OrderItem;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
