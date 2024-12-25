package com.wenxiang.boilingelixir.elixireffects;

import com.wenxiang.boilingelixir.BoilingElixir;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class Explosion extends ElixirEffect {

    public Explosion(float power) {
        this.power = power;
    }
    @Override
    public void onDrink(Level world, LivingEntity user, ItemStack stack) {
        if (!world.isClientSide()){
            world.explode(user, user.getX(), user.getY(), user.getZ(), power, Level.ExplosionInteraction.MOB);
            user.hurt(world.damageSources().explosion(user,user),power*10);
        }else{
//            BoilingElixir.LOGGER.info("test");
        }
    }

}
