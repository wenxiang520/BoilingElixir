package com.wenxiang.boilingelixir.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.wenxiang.boilingelixir.elixireffects.Explosion;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.ConsumableListener;
import net.minecraft.world.level.Level;

import java.util.List;

import static com.wenxiang.boilingelixir.elixireffects.EffectManager.drink;


public record ElixirEffects(int color ,List<String> effects) implements ConsumableListener {

    public static final Codec<ElixirEffects> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("color").forGetter(ElixirEffects::color),
            Codec.list(Codec.STRING).fieldOf("effects").forGetter(ElixirEffects::effects)
            ).apply(instance, ElixirEffects::new)
    );
    public static final StreamCodec<ByteBuf, ElixirEffects> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT,ElixirEffects::color,
            ByteBufCodecs.STRING_UTF8.apply(ByteBufCodecs.list()), ElixirEffects::effects,
            ElixirEffects::new
    );


    public ElixirEffects(int color,List<String> effects) {
        this.effects = effects;
        this.color = color;
    }


    @Override
    public void onConsume(Level level, LivingEntity livingEntity, ItemStack itemStack, Consumable consumable) {
        drink(level,livingEntity,itemStack);
    }

}
