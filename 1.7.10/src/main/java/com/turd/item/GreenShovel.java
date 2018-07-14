package com.turd.item;

import com.turd.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import com.turd.lib.StringLibrary;

public class GreenShovel extends ItemSpade{

	public GreenShovel(ToolMaterial mat) {
		super(mat);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("GreenShovel");
		this.setTextureName(StringLibrary.MODID+":greenShovel");
	}
}
