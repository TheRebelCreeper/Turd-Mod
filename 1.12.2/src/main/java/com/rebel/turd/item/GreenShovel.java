package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class GreenShovel extends ItemSpade
{

	public GreenShovel(String unlocalizedName, String registryName, ToolMaterial material) 
	{
		super(material);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.TOOLS);
	}
}
