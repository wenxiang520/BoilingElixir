package com.wenxiang.boilingelixir.entity;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.wenxiang.boilingelixir.BoilingElixir.MODID;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE,MODID);
    public static final DeferredHolder<EntityType<?>, EntityType<ThrownElixirEntity>> THROWN_ELIXIR_ENTITY = ENTITIES.register(
            "thrown_elixir_entity",
            ()-> {
                return EntityType.Builder.<ThrownElixirEntity>of(ThrownElixirEntity::new, MobCategory.MISC)
                        .noLootTable()
                        .sized(0.25F, 0.25F)
                        .clientTrackingRange(4)
                        .updateInterval(10)
                        .build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MODID, "thrown_elixir_entity")));
            }
    );
    public static void init(IEventBus modEventBus) {
        ENTITIES.register(modEventBus);
    }

}
