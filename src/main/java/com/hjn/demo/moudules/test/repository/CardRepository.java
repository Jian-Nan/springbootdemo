package com.hjn.demo.moudules.test.repository;


import com.hjn.demo.moudules.test.pojo.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description CardRepository
 * @Author HymanHu
 * @Date 2020/8/12 15:13
 */
@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}
