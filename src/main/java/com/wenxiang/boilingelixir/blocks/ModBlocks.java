package com.wenxiang.boilingelixir.blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.wenxiang.boilingelixir.BoilingElixir.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<Block> ALCHEMY_TABLE = BLOCKS.register(
            "alchemy_table",
            registryName->new Block(BlockBehaviour.Properties.of()
                    .setId(ResourceKey.create(Registries.BLOCK,registryName))
                    .destroyTime(2f)
                    .explosionResistance(10f)
                    .sound(SoundType.WOOD)
                    .lightLevel(state -> 15)
            )
    );

    public static void init(IEventBus modEventBus){
        BLOCKS.register(modEventBus);
    }
}
