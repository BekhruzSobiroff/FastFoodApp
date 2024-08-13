package uz.pdp.fastfoodapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.fastfoodapp.repo.RestaurantRepository;

@Service
@RequiredArgsConstructor
public class RestaurantService {
private final RestaurantRepository restaurantRepository;
}

