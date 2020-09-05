package com.amida.test.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.ToolType;

public class Tokyo_Tech_Ore extends Block {

    public Tokyo_Tech_Ore() {
        super(Properties.create(Material.GLASS).hardnessAndResistance(10, 1200));
        this.setRegistryName("tokyo_tech_ore");
    }
    @Override
    public int getHarvestLevel(BlockState state) {
        return 1;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader world, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? 1 + RANDOM.nextInt(5) : 0;
    }

}
