//package com.wenxiang.boilingelixir.event;
//
//import com.wenxiang.boilingelixir.BoilingElixir;
//import com.wenxiang.boilingelixir.client.color.ElixirColor;
//import com.wenxiang.boilingelixir.utils.TooltipUtils;
//import net.minecraft.resources.ResourceLocation;
//import net.neoforged.api.distmarker.Dist;
//import net.neoforged.bus.api.SubscribeEvent;
//import net.neoforged.fml.common.EventBusSubscriber;
//import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
//import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
//
//import static com.wenxiang.boilingelixir.components.ModComponents.ELIXIR_EFFECTS;
////@OnlyIn(Dist.CLIENT)
//@EventBusSubscriber(modid = BoilingElixir.MODID,value= Dist.CLIENT)
//public class EventHandler {
//    @SubscribeEvent
//    public static void onItemTooltip(ItemTooltipEvent event) {
//
//        if (event.getItemStack().has(ELIXIR_EFFECTS)){
//            TooltipUtils.elixirEffectsTooltip(event);
//        }
//
//    }
//
//    @SubscribeEvent
//    public static void onRegisterColor(RegisterColorHandlersEvent event){
////        event.register(ResourceLocation.withDefaultNamespace("elixir_color"), ElixirColor.MAP_CODEC);
//        BoilingElixir.LOGGER.info("Registering color handlers");
//    }
//}
//
