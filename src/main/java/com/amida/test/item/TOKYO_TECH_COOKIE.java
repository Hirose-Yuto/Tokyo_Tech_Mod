package com.amida.test.item;

import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class TOKYO_TECH_COOKIE extends Item {
    public TOKYO_TECH_COOKIE() {
        super(new Properties().food(new Food.Builder().hunger(5).saturation(1.5F).effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 20, 1),1).effect(() -> new EffectInstance(Effects.REGENERATION, 100, 1), 1.0F).effect(() -> new EffectInstance(Effects.ABSORPTION, 2400, 2), 1.0F).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 1),1).effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 2400, 2),1).setAlwaysEdible().build()));
        this.setRegistryName("tokyo_tech_cookie");
    }
}
