package com.turd.item;

import com.turd.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class GreenShovel extends ItemSpade{

	public GreenShovel(ToolMaterial mat) {
		super(mat);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("GreenShovel");
		this.setTextureName("");
	}
}
