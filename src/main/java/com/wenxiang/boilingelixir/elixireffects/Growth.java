package com.wenxiang.boilingelixir.elixireffects;

import com.wenxiang.boilingelixir.utils.BlockUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
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
    public void onCollision(Level world, LivingEntity user, Entity entity, ItemStack stack){
        if(world instanceof ServerLevel){
            var blockPosList = BlockUtils.manhattanDistance3D(entity.getOnPos(),(int)power*2);

            for (BlockPos pos:blockPosList){
//                world.setBlockAndUpdate(pos,world.getBlockState(new BlockPos(pos.getX(),pos.getY()-1,pos.getZ())).getBlock().defaultBlockState());
                BlockUtils.grow(world,pos);
            }
        }
    }
}
