package com.wenxiang.boilingelixir.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ThrownElixirEntity extends ThrownPotion {

    public ThrownElixirEntity(EntityType<? extends ThrownPotion> p_37527_, Level p_37528_) {
        super(p_37527_, p_37528_);
    }

    public ThrownElixirEntity(Level level, LivingEntity owner, ItemStack item) {
        super(level, owner, item);
    }

    public ThrownElixirEntity(Level level, double x, double y, double z, ItemStack item) {
        super(level, x, y, z, item);
    }
}
