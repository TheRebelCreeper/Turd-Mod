package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGreenIngot extends Item
{

	public ItemGreenIngot(String unlocalizedName, String registryName) 
	{
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MATERIALS);
	}
}
