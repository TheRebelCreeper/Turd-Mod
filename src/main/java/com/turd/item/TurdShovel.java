package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.turd.lib.StringLibrary;

public class TurdShovel extends ItemSpade
{
	public TurdShovel(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("TurdShovel");
		this.setTextureName(StringLibrary.MODID+":turdShovel");
	}
}
