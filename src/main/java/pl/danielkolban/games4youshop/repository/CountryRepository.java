package pl.danielkolban.games4youshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.danielkolban.games4youshop.model.Country;


public interface CountryRepository extends JpaRepository<Country, Integer> {
}
