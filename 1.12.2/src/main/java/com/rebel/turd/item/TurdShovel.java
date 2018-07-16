package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class TurdShovel extends ItemSpade
{
	public TurdShovel(String unlocalizedName, String registryName, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
