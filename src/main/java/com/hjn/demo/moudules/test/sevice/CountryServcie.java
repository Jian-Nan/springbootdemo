package com.hjn.demo.moudules.test.sevice;


import com.hjn.demo.moudules.test.pojo.Country;


public interface CountryServcie {

    Country getCountryByCountryId(int countryId);

    Country getCountryByCountryName(String countryName);
}
