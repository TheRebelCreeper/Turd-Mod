package com.rebel.turd.item;

import com.rebel.turd.TurdMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemDonut extends ItemFood
{
	public int potionId;
	public int potionDuration;
	public int potionAmplifier;
	public float potionEffectProbability;
	
	public ItemDonut(String unlocalizedName, String registryName, int healAmount, float saturation, boolean wolfFood) 
	{
		super(healAmount, saturation, wolfFood);
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.FOOD);
		setAlwaysEdible();
	}
	
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 3));
		player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 600, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 1, 20));
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 600, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 600, 2));
		super.onFoodEaten(stack, worldIn, player);
    }
	
}
