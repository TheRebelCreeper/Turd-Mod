package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

import com.turd.lib.StringLibrary;

public class TurdSword extends ItemSword
{
	public TurdSword(ToolMaterial mat) 
	{
		super(mat);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName("TurdSword");
		this.setTextureName(StringLibrary.MODID+":TurdSword");
	}
}
