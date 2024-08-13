package uz.pdp.fastfoodapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.fastfoodapp.entity.Eating;
@Repository
public interface EatingRepository extends JpaRepository<Eating, Long> {
}