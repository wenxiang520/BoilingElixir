package com.wenxiang.boilingelixir.utils;

import com.wenxiang.boilingelixir.components.ModComponents;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.CommonComponents;
import net.minecraft.network.chat.Component;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;


public class TooltipUtils {
    public static void elixirEffectsTooltip(ItemTooltipEvent event) {
        var elixirEffects = event.getItemStack().getComponents().get(ModComponents.ELIXIR_EFFECTS.get());
        if (elixirEffects != null){
            //渲染标题
            var component = Component.translatable("item.boiling_elixir.tooltip.title").withStyle(ChatFormatting.GRAY);
            event.getToolTip().addLast(component);
            //循环渲染效果
            for (String effectName :elixirEffects.effects()){
                var newline = Component.empty();
                newline.append(CommonComponents.SPACE);
                newline.append(Component.literal("-"));
                newline.append(CommonComponents.SPACE);
                newline.append(Component.translatable("item.boiling_elixir.elixir_effects." + effectName));
                newline.withStyle(ChatFormatting.GRAY);
                event.getToolTip().addLast(newline);
            }
            //渲染“物品颜色”tooltip
            if(event.getFlags().isAdvanced()){
                event.getToolTip().addLast(Component.translatable("item.color",ColorUtils.intToColorCode(elixirEffects.color())).withStyle(ChatFormatting.GRAY));
            }
        }
    }
}
