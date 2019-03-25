package com.geely.design.pattern.behavioral.strategy;

/**
 * Created by geely
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
