package com.qianfeng.fxmall.goods.service;

import com.qianfeng.fxmall.goods.bean.WxbGood;

import java.util.List;

public interface IWxbGoodService {
    List<WxbGood> selectWxbGoodByPage(int Page);
    void  insertWxbGoodAndSku(WxbGood wxbGood);
    void  updateWxbGood(WxbGood wxbGood);
    void deleteGood(Integer goodId);
    int wxbGoodCount();
}
