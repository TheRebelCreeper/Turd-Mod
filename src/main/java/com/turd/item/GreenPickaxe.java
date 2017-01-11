package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

import com.turd.lib.StringLibrary;

public class GreenPickaxe extends ItemPickaxe {

	protected GreenPickaxe(ToolMaterial p_i45347_1_) 
	{
		super(p_i45347_1_);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("GreenPickaxe");
		this.setTextureName(StringLibrary.MODID+":GreenPick");
	}
}