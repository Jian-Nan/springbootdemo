package com.hjn.demo.moudules.test.sevice;

import com.github.pagehelper.PageInfo;
import com.hjn.demo.moudules.common.vo.SearchVo;
import com.hjn.demo.moudules.test.pojo.City;


import java.util.List;

/**
 * @Description CityService
 * @Author HymanHu
 * @Date 2020/8/11 14:09
 */
public interface CityService {

    List<City> getCitiesByCountryId(int countryId);

    PageInfo<City> getCitiesBySearchVo(int countryId, SearchVo searchVo);
}
