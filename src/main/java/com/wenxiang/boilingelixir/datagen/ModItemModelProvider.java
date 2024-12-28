package com.wenxiang.boilingelixir.datagen;

import com.wenxiang.boilingelixir.BoilingElixir;
import com.wenxiang.boilingelixir.items.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, BoilingElixir.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.withExistingParent(ModItems.ELIXIR.getId().toString(), mcLoc("item/generated"))
                .texture("layer0", "minecraft:item/potion_overlay")
                .texture("layer1", "minecraft:item/potion");

        this.withExistingParent(ModItems.THROWN_ELIXIR.getId().toString(), mcLoc("item/generated"))
                .texture("layer0", "minecraft:item/potion_overlay")
                .texture("layer1", "minecraft:item/splash_potion");

    }
}
