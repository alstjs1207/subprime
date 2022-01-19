package com.yulotte.subprime.service;

import com.yulotte.subprime.entity.Apartment;
import com.yulotte.subprime.repository.ApartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * apartment 트랜잭션을 관리하기 위한 service
 */

@Service
@AllArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    public Apartment findById(Long id) {
        Apartment apartment = apartmentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 아이디가 없습니다."+ id));
        return apartment;
    }

    public Long getPriceOrThrow(Long id) {
        return apartmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 아이디가 없습니다."+ id))
                .getPrice();
    }
}
