package com.wenxiang.boilingelixir.entity;

import com.wenxiang.boilingelixir.elixireffects.EffectManager;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

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



    @Override
    protected void onHitBlock(BlockHitResult result) {
        if (!this.level().isClientSide()) {
        ItemStack stack = this.getItem();
        EffectManager.onCollision(this.level(), (LivingEntity) this.getOwner(),this,stack);
        }
        this.discard();
    }

    @Override
    protected void onHit(HitResult result) {
        if (!this.level().isClientSide()) {
            BlockHitResult blockHitResult = new BlockHitResult(result.getLocation(),this.getDirection(),blockPosition(),true);
            this.onHitBlock(blockHitResult);
        }
    }

}
