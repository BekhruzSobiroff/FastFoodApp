package uz.pdp.fastfoodapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.fastfoodapp.repo.EatingRepository;

@Service
@RequiredArgsConstructor
public class EatingService {
private final EatingRepository eatingRepository;
}
