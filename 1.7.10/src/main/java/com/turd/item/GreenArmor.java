package com.turd.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.turd.lib.StringLibrary;

public class GreenArmor extends ItemArmor
{

	public GreenArmor(ArmorMaterial Material, int ArmorIndex, int Slot, String UnlocalizedName, String TextureName) //ArmorIndex is in client proxy
	{
		super(Material,ArmorIndex, Slot);
		this.setUnlocalizedName(UnlocalizedName);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName(StringLibrary.MODID+TextureName);
	}
	
	 public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) 
	 {
	        if(slot == 0 || slot == 1 || slot == 3) 
	        {
	            return StringLibrary.MODID + ":textures/models/armor/greenLayer1.png";
	 
	        }
	        else if(slot == 2) 
	        {
	            return StringLibrary.MODID + ":textures/models/armor/greenLayer2.png";
	        }
	        else 
	        {
	            return null;
	        }
	 }
}
