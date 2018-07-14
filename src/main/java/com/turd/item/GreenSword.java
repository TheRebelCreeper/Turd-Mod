package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class GreenSword extends ItemSword
{
	public GreenSword(ToolMaterial mat) 
	{
		super(mat);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName("GreenSword");
		this.setTextureName(StringLibrary.MODID+":greenSword");
	}

}
