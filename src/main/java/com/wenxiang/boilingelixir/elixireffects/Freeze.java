package com.wenxiang.boilingelixir.elixireffects;

import com.wenxiang.boilingelixir.utils.BlockUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Freeze extends ElixirEffect{
    public Freeze(float power) {
        this.power = power;
    }
    @Override
    public void onDrink(Level world, LivingEntity user, ItemStack stack) {
        if (!world.isClientSide()){
            world.explode(user, user.getX(), user.getY(), user.getZ(), power, Level.ExplosionInteraction.MOB);
            user.hurt(world.damageSources().freeze(),power*10);
        }
    }

    @Override
    public void onCollision(Level world, LivingEntity user, Entity entity, ItemStack stack) {
        if (!world.isClientSide()) {
            var blockPosList = BlockUtils.manhattanDistance3D(entity.getOnPos(),(int)power);

            for (BlockPos pos:blockPosList){
                    BlockUtils.freeze(world,pos);
                }
        }
    }
}
