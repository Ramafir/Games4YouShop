package pl.danielkolban.games4youshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.danielkolban.games4youshop.model.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
