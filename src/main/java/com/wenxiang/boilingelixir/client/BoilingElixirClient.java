package com.wenxiang.boilingelixir.client;

import com.wenxiang.boilingelixir.BoilingElixir;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = BoilingElixir.MODID,dist = Dist.CLIENT)
public class BoilingElixirClient {
    public BoilingElixirClient(IEventBus modBus) {
//        modBus.register(new ClientEventHandler());
    }
}
