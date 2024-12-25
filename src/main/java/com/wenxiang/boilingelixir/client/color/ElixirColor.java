package com.wenxiang.boilingelixir.client.color;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.util.ExtraCodecs;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public record ElixirColor(int defaultColor) implements ItemTintSource {
    public static final MapCodec<net.minecraft.client.color.item.Potion> MAP_CODEC = RecordCodecBuilder.mapCodec(
            p_386980_ -> p_386980_.group(ExtraCodecs.RGB_COLOR_CODEC.fieldOf("default").forGetter(net.minecraft.client.color.item.Potion::defaultColor)).apply(p_386980_, net.minecraft.client.color.item.Potion::new)
    );

    public ElixirColor() {
        this(16711680);
    }

    @Override
    public int calculate(ItemStack p_387621_, @Nullable ClientLevel p_390426_, @Nullable LivingEntity p_390389_) {
//        PotionContents potioncontents = p_387621_.get(DataComponents.POTION_CONTENTS);
        return 16711680;
    }

    @Override
    public MapCodec<net.minecraft.client.color.item.Potion> type() {
        return MAP_CODEC;
    }
}