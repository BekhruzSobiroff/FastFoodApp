package uz.pdp.fastfoodapp.repo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.pdp.fastfoodapp.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsUserByEmailAndPassword(String email, String password);
    boolean existsUserByEmail(String email);
    @Transactional
    @Modifying
    @Query(value = "UPDATE users u SET password = :newPassword WHERE u.email = :email",nativeQuery = true)
    int updatePassword(@Param("email") String email, @Param("newPassword") String newPassword);

}