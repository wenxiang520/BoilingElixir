package com.wenxiang.boilingelixir.components;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.component.DyedItemColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.wenxiang.boilingelixir.BoilingElixir.MODID;

public class ModComponents {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE,MODID);
 public static final Supplier<DataComponentType<ElixirEffects>> ELIXIR_EFFECTS =DATA_COMPONENTS.register(
            "elixir_effects",
            ()->new DataComponentType.Builder<ElixirEffects>().persistent(ElixirEffects.CODEC).networkSynchronized(ElixirEffects.STREAM_CODEC).build());

    public static void init(IEventBus modEventBus){
        DATA_COMPONENTS.register(modEventBus);
    }
}
