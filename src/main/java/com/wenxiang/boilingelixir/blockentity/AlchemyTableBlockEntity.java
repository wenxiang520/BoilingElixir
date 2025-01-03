package com.wenxiang.boilingelixir.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class AlchemyTableBlockEntity extends BlockEntity {
    public AlchemyTableBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.ALCHEMY_TABLE_BLOCK_ENTITY.get(), pos, blockState);
    }
}
