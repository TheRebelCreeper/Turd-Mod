package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import com.turd.lib.StringLibrary;

public class TurdPickaxe extends ItemPickaxe
{

	public TurdPickaxe(ToolMaterial p_i45347_1_) 
	{
		super(p_i45347_1_);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("TurdPickaxe");
		this.setTextureName(StringLibrary.MODID+":TurdPick");
	}

}
