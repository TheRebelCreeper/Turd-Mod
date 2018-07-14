package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.turd.lib.StringLibrary;

public class TurdHoe extends ItemHoe
{
	public TurdHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("TurdHoe");
		this.setTextureName(StringLibrary.MODID+":turdHoe");
	}
}
