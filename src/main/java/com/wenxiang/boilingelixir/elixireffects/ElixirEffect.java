package com.wenxiang.boilingelixir.elixireffects;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class ElixirEffect {
    protected float power;

    void onDrink(Level world, LivingEntity user, ItemStack stack){}
}
