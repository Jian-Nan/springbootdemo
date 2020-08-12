package com.hjn.demo.moudules.test.dao;


import com.hjn.demo.moudules.test.pojo.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description CityDao
 * @Author HymanHu
 * @Date 2020/8/11 14:08
 */
@Repository
@Mapper
public interface CityDao {

    @Select("select * from m_city where country_id = #{countryId}")
    List<City> getCitiesByCountryId(int countryId);
}
