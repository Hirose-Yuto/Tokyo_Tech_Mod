package com.amida.test.item.armor;

import com.amida.test.init.Tokyo_Tech_Items;
import com.amida.test.item.TOKYO_TECH;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundEvent;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.SoundEvents;

public class Tokyo_Tech_ArmorMaterial implements IArmorMaterial {
    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        int durability;
        switch (slotIn) {
            case HEAD:
                durability = 50 * 11;
                break;
            case CHEST:
                durability = 50 * 16;
                break;
            case LEGS:
                durability = 50 * 15;
                break;
            case FEET:
                durability = 50 * 13;
                break;
            default:
                durability = 0;
                break;
        }
        return durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        int damageReduction;
        switch (slotIn) {
            case HEAD:
            case FEET:
                damageReduction = 5;
                break;
            case CHEST:
                damageReduction = 10;
                break;
            case LEGS:
                damageReduction = 8;
                break;
            default:
                damageReduction = 0;
                break;
        }
        return damageReduction;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return SoundEvents.BLOCK_END_PORTAL_SPAWN;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(new TOKYO_TECH());
    }

    @Override
    public String getName() {
        return "test:tokyotech";
    }

    @Override
    public float getToughness() {
        return ArmorMaterial.DIAMOND.getToughness();
    }
}
