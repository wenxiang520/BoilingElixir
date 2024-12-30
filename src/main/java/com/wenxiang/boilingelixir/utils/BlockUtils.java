package com.wenxiang.boilingelixir.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BlockUtils {
    public static List<BlockPos> manhattanDistance3D(BlockPos pos, int distance) {
        List<BlockPos> list = new ArrayList<BlockPos>();
        int cx = pos.getX();
        int cy = pos.getY();
        int cz = pos.getZ();
        for (int x = cx - distance; x <= cx + distance; x++) {
            for (int y = cy - distance; y <= cy + distance; y++) {
                for (int z = cz - distance; z <= cz + distance; z++) {
                    if (Math.abs(x - cx) + Math.abs(y - cy) + Math.abs(z - cz) <= distance) {
                        list.add(new BlockPos(x, y, z));
                    }
                }
            }
        }
        return list;
    }

    public static void grow(Level world, BlockPos pos) {
        BlockState blockstate = world.getBlockState(pos);
        if (blockstate.getBlock() instanceof BonemealableBlock bonemealableblock && bonemealableblock.isValidBonemealTarget(world, pos, blockstate)) {
            if (world instanceof ServerLevel) {
                if (bonemealableblock.isBonemealSuccess(world, world.random, pos, blockstate)) {
                    bonemealableblock.performBonemeal((ServerLevel) world, world.random, pos, blockstate);
                }
            }
        }
    }
}
