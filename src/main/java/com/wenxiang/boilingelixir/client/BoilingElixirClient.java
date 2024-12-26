package com.wenxiang.boilingelixir.client;

import com.wenxiang.boilingelixir.BoilingElixir;
import com.wenxiang.boilingelixir.event.ClientEventHandler;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.EventBus;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod(value = BoilingElixir.MODID,dist = Dist.CLIENT)
public class BoilingElixirClient {
    public BoilingElixirClient(IEventBus modBus) {
//        modBus.register(new ClientEventHandler());
    }
}
