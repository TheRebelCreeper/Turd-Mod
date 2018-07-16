package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class TurdSword extends ItemSword
{
	public TurdSword(String unlocalizedName, String registryName, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.COMBAT);
	}
}
