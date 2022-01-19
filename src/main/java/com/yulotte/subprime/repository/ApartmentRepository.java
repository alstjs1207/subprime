package com.yulotte.subprime.repository;

import com.yulotte.subprime.entity.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * apartment jpa
 */
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}
