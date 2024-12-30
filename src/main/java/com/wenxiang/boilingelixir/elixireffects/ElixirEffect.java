package com.wenxiang.boilingelixir.elixireffects;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ElixirEffect {
    protected float power;

    void onDrink(Level world, LivingEntity user, ItemStack stack){}
    void onCollision(Level world, LivingEntity user, Entity entity, ItemStack stack){}
}
