package com.wenxiang.boilingelixir.elixireffects;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Growth extends ElixirEffect{

    public Growth(float power) {
        this.power = power;
    }
    @Override
    public void onDrink(Level world, LivingEntity user, ItemStack stack){
        user.hurt(world.damageSources().magic(),power*2f);
    }
    @Override
    public void onCollision(Level world, LivingEntity user, ItemStack stack){

    }
}
