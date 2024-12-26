package com.wenxiang.boilingelixir.elixireffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Explosion extends ElixirEffect {

    public Explosion(float power) {
        this.power = power;
    }
    @Override
    public void onDrink(Level world, LivingEntity user, ItemStack stack) {
        if (!world.isClientSide()){
            world.explode(user, user.getX(), user.getY(), user.getZ(), power, Level.ExplosionInteraction.MOB);
            user.hurt(world.damageSources().explosion(user,user),power*10);
        }
    }

    @Override
    public void onCollision(Level world, LivingEntity user, ItemStack stack) {

    }

}
