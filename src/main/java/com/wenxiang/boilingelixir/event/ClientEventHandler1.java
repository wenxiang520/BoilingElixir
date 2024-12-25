package com.wenxiang.boilingelixir.event;

import com.wenxiang.boilingelixir.BoilingElixir;
import com.wenxiang.boilingelixir.utils.TooltipUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

import static com.wenxiang.boilingelixir.components.ModComponents.ELIXIR_EFFECTS;

//@OnlyIn(Dist.CLIENT)
@EventBusSubscriber(modid = BoilingElixir.MODID,value= Dist.CLIENT)
    public class ClientEventHandler1 {
    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {

        if (event.getItemStack().has(ELIXIR_EFFECTS)){
            TooltipUtils.elixirEffectsTooltip(event);
        }

    }
}
