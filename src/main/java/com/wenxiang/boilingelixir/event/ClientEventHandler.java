package com.wenxiang.boilingelixir.event;

import com.wenxiang.boilingelixir.client.color.ElixirColor;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

//@OnlyIn(Dist.CLIENT)
//@EventBusSubscriber(modid = BoilingElixir.MODID,value= Dist.CLIENT)
public class ClientEventHandler {
    @SubscribeEvent
    public void onRegisterColor(RegisterColorHandlersEvent event){
//        event.register(ResourceLocation.withDefaultNamespace("elixir_color"), ElixirColor.MAP_CODEC);
//        BoilingElixir.LOGGER.info("Registering color handlers");
    }



}

