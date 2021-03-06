package com.hjn.demo.moudules.test.controller;

import com.hjn.demo.moudules.common.vo.Result;
import com.hjn.demo.moudules.test.pojo.Card;
import com.hjn.demo.moudules.test.sevice.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description CardController
 * @Author HymanHu
 * @Date 2020/8/12 15:21
 */
@RestController
@RequestMapping("/api")
public class CardController {

    @Autowired
    private CardService cardService;

    /**
     * 127.0.0.1/api/card ---- post
     * {"cardNo":"cdascdas687dsa78"}
     */
    @PostMapping(value = "/card", consumes = "application/json")
    public Result<Card> insertCard(@RequestBody Card card) {
        return cardService.insertCard(card);
    }
}
