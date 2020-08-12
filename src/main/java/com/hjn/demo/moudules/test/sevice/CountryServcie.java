package com.hjn.demo.moudules.test.sevice;


import com.hjn.demo.moudules.test.pojo.Country;

/**
 * @Description CountryServcie
 * @Author HymanHu
 * @Date 2020/8/11 13:59
 */
public interface CountryServcie {

    Country getCountryByCountryId(int countryId);

    Country getCountryByCountryName(String countryName);
}
