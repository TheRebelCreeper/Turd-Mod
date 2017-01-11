package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GreenItem extends Item
{
    public GreenItem(String par1, String par2)
    {
    	this.setUnlocalizedName(par1);
    	this.setCreativeTab(CreativeTabs.tabMaterials);
    	this.setTextureName(par2);
    }  
}

