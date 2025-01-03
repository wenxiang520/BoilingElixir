package com.wenxiang.boilingelixir.blockentity;

import com.wenxiang.boilingelixir.BoilingElixir;
import com.wenxiang.boilingelixir.blocks.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, BoilingElixir.MODID);
//    public static final Supplier<BlockEntityType<AlchemyTableBlockEntity>> ALCHEMY_TABLE_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
//            "alchemy_table_block_entity",
//            ()->new BlockEntityType<>(
//                    AlchemyTableBlockEntity::new,
//                    ModBlocks.ALCHEMY_TABLE.get()
//            )
//    );
    public static final Supplier<BlockEntityType<AlchemyTableBlockEntity>> ALCHEMY_TABLE_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "alchemy_table_block_entity",
            ()->new BlockEntityType<>(
                    AlchemyTableBlockEntity::new,
                    ModBlocks.ALCHEMY_TABLE.get()
    ));


    public static void init(IEventBus modEventBus) {
        BLOCK_ENTITY_TYPES.register(modEventBus);
    }
}
