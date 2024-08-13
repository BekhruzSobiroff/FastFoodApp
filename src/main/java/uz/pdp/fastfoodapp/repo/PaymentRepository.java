package uz.pdp.fastfoodapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.fastfoodapp.entity.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}