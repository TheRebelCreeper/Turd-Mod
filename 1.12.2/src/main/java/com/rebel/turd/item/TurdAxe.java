package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class TurdAxe extends ItemAxe
{
	public TurdAxe(String unlocalizedName, String registryName, ToolMaterial material) 
	{
		super(material, 8.0f, -3.0f);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
