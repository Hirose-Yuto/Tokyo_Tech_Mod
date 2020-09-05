package com.amida.test.init;

import com.amida.test.item.TOKYO_TECH;
import com.amida.test.item.TOKYO_TECH_COOKIE;
import com.amida.test.item.armor.Tokyo_Tech_Chest_Armor;
import com.amida.test.item.armor.Tokyo_Tech_Feet_Armor;
import com.amida.test.item.armor.Tokyo_Tech_Head_Armor;
import com.amida.test.item.armor.Tokyo_Tech_Legs_Armor;
import com.amida.test.item.tool.Tokyo_Tech_Pickaxe;
import com.amida.test.main.Test;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Test.MOD_ID)
public class Tokyo_Tech_Items {
    @Mod.EventBusSubscriber(modid = Test.MOD_ID, bus = Bus.MOD)
    public static class Register {
        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final Item[] item = {
                    new TOKYO_TECH(),
                    new Tokyo_Tech_Pickaxe(),
                    new Tokyo_Tech_Head_Armor(),
                    new Tokyo_Tech_Chest_Armor(),
                    new Tokyo_Tech_Legs_Armor(),
                    new Tokyo_Tech_Feet_Armor(),
                    new TOKYO_TECH_COOKIE()
            };

            event.getRegistry().registerAll(item);
        }
    }
}
