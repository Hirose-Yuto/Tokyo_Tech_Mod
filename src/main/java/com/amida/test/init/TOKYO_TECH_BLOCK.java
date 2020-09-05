package com.amida.test.init;

import com.amida.test.block.Tokyo_Tech_Block;
import com.amida.test.main.Test;
import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Test.MOD_ID)
public class TOKYO_TECH_BLOCK {

    public static final Tokyo_Tech_Block tokyo_tech_block = null;

    @Mod.EventBusSubscriber(modid = Test.MOD_ID, bus = Bus.MOD)
    public static class Register {

        @SubscribeEvent
        public static void registerBlock(final RegistryEvent.Register<Block> event) {
            final Block[] blocks = {
                    new Tokyo_Tech_Block()
            };

            event.getRegistry().registerAll(blocks);
        }

        @SubscribeEvent
        public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
            final BlockItem[] items = {
                    new BlockItem(tokyo_tech_block,new Properties().group(Test.tokyo_tech_tab))
            };

            for(final BlockItem item : items) {
                final Block block = item.getBlock();
                final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has a null registry name", block);
                event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}