package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

import com.turd.lib.StringLibrary;

public class TurdAxe extends ItemAxe
{
	public TurdAxe(ToolMaterial p_i45327_1_) 
	{
		super(p_i45327_1_);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName("TurdAxe");
		this.setTextureName(StringLibrary.MODID+":TurdAxe");
	}
}
