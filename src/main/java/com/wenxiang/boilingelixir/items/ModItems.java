package com.wenxiang.boilingelixir.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.wenxiang.boilingelixir.BoilingElixir.MODID;
import static net.minecraft.world.item.Items.GLASS_BOTTLE;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredItem<Item> ELIXIR = ITEMS.registerSimpleItem("elixir", new ElixirItem.Properties().usingConvertsTo(GLASS_BOTTLE));
    public static final DeferredItem<Item> THROWN_ELIXIR = ITEMS.registerSimpleItem("thrown_elixir", new ThrownElixirItem.Properties());


    public static void init(IEventBus modEventBus) {
        ITEMS.register(modEventBus);//注册物品
    }

}
