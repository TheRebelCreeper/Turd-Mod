package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTurd extends ItemFood
{
	public ItemTurd(String unlocalizedName, String registryName, int healAmout, float saturation, boolean wolfFood) 
	{
		super(healAmout, saturation, wolfFood);
		this.setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
    	this.setCreativeTab(CreativeTabs.FOOD);
    	this.setAlwaysEdible();
    	
	}
	
	protected void onFoodEaten(ItemStack p_77849_1_, World p_77849_2_, EntityPlayer p_77849_3_)
    {
            p_77849_3_.addPotionEffect(new PotionEffect(MobEffects.POISON, 100, 0));
            p_77849_3_.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 300, 1));
            p_77849_3_.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300, 1));
            super.onFoodEaten(p_77849_1_, p_77849_2_, p_77849_3_);
    }
}
