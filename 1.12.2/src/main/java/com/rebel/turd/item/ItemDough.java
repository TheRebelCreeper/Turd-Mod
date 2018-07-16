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

public class ItemDough extends ItemFood
{
	
	public int potionId;
	public int potionDuration;
	public int potionAmplifier;
	public float potionEffectProbability;
	
	public ItemDough(String unlocalizedName, String registryName, int healAmount, float saturation, boolean wolfFood) 
	{
		super(healAmount, saturation, wolfFood);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.FOOD);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
            player.addPotionEffect(new PotionEffect(MobEffects.POISON, 100, 0));
            player.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 300, 1));
            super.onFoodEaten(stack, worldIn, player);
    }
	
}
