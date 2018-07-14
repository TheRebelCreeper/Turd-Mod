package com.turd.item;

import com.turd.lib.StringLibrary;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import com.turd.lib.StringLibrary;

public class GreenHoe extends ItemHoe{

	public GreenHoe(ToolMaterial mat) {
		super(mat);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("GreenHoe");
		this.setTextureName(StringLibrary.MODID+":greenHoe");
	}

}
