package com.wenxiang.boilingelixir.elixireffects;

import com.wenxiang.boilingelixir.BoilingElixir;
import com.wenxiang.boilingelixir.components.ModComponents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.*;

public class EffectManager {
    //测试
    public static void test(LivingEntity livingEntity, ItemStack stack) {

        getElixirEffectList(stack).forEach(effect -> {

        });
//    BoilingElixir.LOGGER.info(countStringFrequencies(effects).toString()); //记得弄一个修正
    }

    public static void drink(Level level, LivingEntity user, ItemStack stack){
        if (getElixirEffectList(stack).isEmpty()) {
            return;
        }
        getElixirEffectList(stack).forEach(effect -> {
            effect.onDrink(level,user,stack);
        });
    }

    public static void onCollision(Level level, LivingEntity user, Entity entity, ItemStack stack){
        if (getElixirEffectList(stack).isEmpty()) {
            return;
        }
        getElixirEffectList(stack).forEach(effect -> {
            effect.onCollision(level,user,entity,stack);
        });
    }




    //从物品叠中获取ElixirEffectList
    public static List<ElixirEffect> getElixirEffectList(ItemStack stack){
        if (!stack.has(ModComponents.ELIXIR_EFFECTS)){
            return Collections.emptyList();
        }
        var effects = Objects.requireNonNull(stack.get(ModComponents.ELIXIR_EFFECTS)).effects();
        List<ElixirEffect> elixirEffectList = new ArrayList<>();


        var effects_format = countStringFrequencies(effects);
        //循环读取,顺便转换为float
        for (Map.Entry<String,Integer> entry: effects_format.entrySet()) {
            switch (entry.getKey()) {
                case "explosion"://爆炸
                    elixirEffectList.addLast(new Explosion((float)entry.getValue()));
                    break;

                case "growth":
                    elixirEffectList.addLast(new Growth((float)entry.getValue()));
                    break;

                case "freeze":
                    elixirEffectList.addLast(new Freeze((float)entry.getValue()));
                    break;

            }
        }
        return elixirEffectList;
    }




    //转换格式的函数
    public static Map<String, Integer> countStringFrequencies(List<String> strings) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String str : strings) {
            // 如果Map中已经包含了该字符串，则增加其计数
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                // 如果Map中没有该字符串，则将其添加到Map中，计数为1
                frequencyMap.put(str, 1);
            }
        }

        return frequencyMap;
}}
