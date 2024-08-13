package uz.pdp.fastfoodapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "restaurant")
@Entity
public class Restaurant {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;

private String address;
private String phone;
}
