package com.amida.test.item;

import com.amida.test.main.Test;
import net.minecraft.item.Item;

public class TOKYO_TECH extends Item {
    public TOKYO_TECH() {
        super(new Properties().group(Test.tokyo_tech_tab));
        this.setRegistryName("tokyo_tech");
    }

}
