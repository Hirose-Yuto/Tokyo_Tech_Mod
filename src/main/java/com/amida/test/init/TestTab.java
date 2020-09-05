package com.amida.test.init;

import com.amida.test.block.Tokyo_Tech_Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TestTab extends ItemGroup {
    public TestTab(){
        super("test");
    }
    @Override
    public ItemStack createIcon() {
        return new ItemStack(new Tokyo_Tech_Block());
    }
}
