package pl.danielkolban.games4youshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.danielkolban.games4youshop.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
