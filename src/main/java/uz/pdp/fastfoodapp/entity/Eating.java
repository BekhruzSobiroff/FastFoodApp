package uz.pdp.fastfoodapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.fastfoodapp.entity.enums.TypeEating;

@Table(name = "food")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Eating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private TypeEating typeEating;
private Double price;
@ManyToOne(fetch = FetchType.LAZY,targetEntity = Restaurant.class)
private Long restaurantId;

}
