package com.hjn.demo.moudules.test.sevice.impl;


import com.hjn.demo.moudules.common.vo.Result;
import com.hjn.demo.moudules.test.pojo.Card;
import com.hjn.demo.moudules.test.repository.CardRepository;
import com.hjn.demo.moudules.test.sevice.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description CardServiceImpl
 * @Author HymanHu
 * @Date 2020/8/12 15:16
 */
@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Override
    @Transactional
    public Result<Card> insertCard(Card card) {
        cardRepository.saveAndFlush(card);
        return new Result<Card>(
                Result.ResultStatus.SUCCESS.status,
                "Insert success.", card);
    }
}
