package uz.pdp.fastfoodapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import uz.pdp.fastfoodapp.entity.enums.Payment_type;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "account_num" ,length = 16)
    private String account_num;
    private Payment_type payment_type;
    private Date payment_date;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = User.class)
    private Long user_id;
}
