package com.hjn.demo.moudules.test.repository;


import com.hjn.demo.moudules.test.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description StudentRepository
 * @Author HymanHu
 * @Date 2020/8/12 15:31
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
