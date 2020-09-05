package com.amida.test.item.tool;

import com.amida.test.main.Test;
import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class Tokyo_Tech_Pickaxe extends PickaxeItem {
    public Tokyo_Tech_Pickaxe() {
        super(Item_Tier_Tokyo_Tech.TOKYO_TECH_PICKAXE, 2, 0, new Properties().group(Test.tokyo_tech_tab));
        this.setRegistryName("tokyo_tech_pickaxe");
    }
}
