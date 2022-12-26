package com.messaging.rate.repository;

import com.messaging.rate.models.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RateRepository extends JpaRepository<Rate,String> {

    List<Rate> findAllByDate(Date date);

    Rate findByDateAndCode(Date date,String code);
}
