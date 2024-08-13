package uz.pdp.fastfoodapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.fastfoodapp.entity.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}