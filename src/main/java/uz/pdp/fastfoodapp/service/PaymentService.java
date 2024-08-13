package uz.pdp.fastfoodapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.fastfoodapp.repo.PaymentRepository;

@Service
@RequiredArgsConstructor
public class PaymentService {
private final PaymentRepository paymentRepository;
}
