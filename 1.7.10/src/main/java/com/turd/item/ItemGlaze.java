package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.turd.lib.StringLibrary;

public class ItemGlaze extends Item
{
	public ItemGlaze()
	{
		this.setUnlocalizedName("ItemGlaze");
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(StringLibrary.MODID +":itemGlaze");
	}
}
