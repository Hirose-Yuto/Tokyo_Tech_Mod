package com.amida.test.item.armor;

import com.amida.test.main.Test;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;

public class Tokyo_Tech_Legs_Armor extends ArmorItem {
    public Tokyo_Tech_Legs_Armor() {
        super(new Tokyo_Tech_ArmorMaterial(), EquipmentSlotType.LEGS, new Properties().group(Test.tokyo_tech_tab));
        this.setRegistryName("tokyo_tech_legs_armor");
    }
}
