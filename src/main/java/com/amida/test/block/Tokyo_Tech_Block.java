package com.amida.test.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Tokyo_Tech_Block extends Block {
    public Tokyo_Tech_Block() {
        super(Properties.create(Material.IRON).hardnessAndResistance(10, 1200));
        this.setRegistryName("tokyo_tech_block");
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return 0;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

}
