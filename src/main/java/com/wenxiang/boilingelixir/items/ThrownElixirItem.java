package com.wenxiang.boilingelixir.items;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ThrownElixirItem extends ElixirItem{

    public ThrownElixirItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull Level world, Player user, @NotNull InteractionHand interactionHand) {
        ItemStack itemstack = user.getItemInHand(interactionHand);
        if (world instanceof ServerLevel serverlevel) {
//            Projectile.spawnProjectileFromRotation(ThrownPotion::new, serverlevel, itemstack, user, -20.0F, 0.5F, 1.0F);
        }

        user.awardStat(Stats.ITEM_USED.get(this));
        itemstack.consume(1, user);
        return InteractionResult.SUCCESS;
    }
}
