package com.amida.test.item.tool;

import com.amida.test.init.Tokyo_Tech_Items;
import com.amida.test.item.TOKYO_TECH;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemTier;
import net.minecraft.item.crafting.Ingredient;


public enum Item_Tier_Tokyo_Tech implements IItemTier {
    TOKYO_TECH_PICKAXE(3000, 12, 4, ItemTier.DIAMOND.getHarvestLevel(), ItemTier.DIAMOND.getEnchantability(), Ingredient.fromItems(new TOKYO_TECH()));

    private final int maxUse;
    private final float efficiency;
    private final float attackDamage;
    private final int harvestLevel;
    private final int enchantability;
    private final Ingredient repairMaterial;

    Item_Tier_Tokyo_Tech(int maxUse, float efficiency, float attackDamage, int harvestLevel, int enchantability, Ingredient repairMaterial) {
        this.maxUse = maxUse;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUse;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial;
    }
}
