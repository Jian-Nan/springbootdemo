package com.hjn.demo.moudules.test.sevice;


import com.hjn.demo.moudules.common.vo.Result;
import com.hjn.demo.moudules.test.pojo.Card;

/**
 * @Description CardService
 * @Author HymanHu
 * @Date 2020/8/12 15:15
 */
public interface CardService {

    Result<Card> insertCard(Card card);
}
