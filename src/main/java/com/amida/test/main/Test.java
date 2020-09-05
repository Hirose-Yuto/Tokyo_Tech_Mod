package com.amida.test.main;

import com.amida.test.init.TestTab;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;

@Mod(Test.MOD_ID)
public class Test {
    public static final String MOD_ID = "test";
    public static final ItemGroup tokyo_tech_tab = new TestTab();

}
