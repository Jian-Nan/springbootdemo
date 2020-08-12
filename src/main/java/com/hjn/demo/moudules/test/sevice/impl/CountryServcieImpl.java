package com.hjn.demo.moudules.test.sevice.impl;


import com.hjn.demo.moudules.test.dao.CountryDao;
import com.hjn.demo.moudules.test.pojo.Country;
import com.hjn.demo.moudules.test.sevice.CountryServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;


@Service
public class CountryServcieImpl implements CountryServcie {

    @Autowired
    private CountryDao countryDao;

    @Override
    public Country getCountryByCountryId(int countryId) {
        return countryDao.getCountryByCountryId(countryId);
    }

    @Override
    public Country getCountryByCountryName(String countryName) {
        return countryDao.getCountryByCountryName(countryName);
    }
}
