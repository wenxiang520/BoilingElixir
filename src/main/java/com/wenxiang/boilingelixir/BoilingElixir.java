package com.wenxiang.boilingelixir;

import com.mojang.logging.LogUtils;
import com.wenxiang.boilingelixir.components.ModComponents;
import com.wenxiang.boilingelixir.entity.ModEntities;
import com.wenxiang.boilingelixir.items.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

import java.util.List;

@Mod(BoilingElixir.MODID)
public class BoilingElixir {
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "boiling_elixir";
    public BoilingElixir(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.init(modEventBus);//传入modEventBus进行初始化物品
        ModComponents.init(modEventBus);//传入modEventBus进行初始化物品数据组件
        ModEntities.init(modEventBus);
    }



}
