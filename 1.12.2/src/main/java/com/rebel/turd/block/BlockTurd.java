package com.rebel.turd.block;

import java.util.Random;

import com.rebel.turd.TurdMod;
import com.rebel.turd.init.TurdItems;

import net.minecraft.block.BlockDragonEgg;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockTurd extends BlockDragonEgg
{
    
	public BlockTurd(String unlocalizedName, String registryName)
    {
		setUnlocalizedName(TurdMod.MODID + "." + unlocalizedName);
		setRegistryName(registryName);
        setHardness(1);
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("SPADE", 0);
    }
	
	@SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
		//System.out.println("PARTICLE");
		//worldIn.spawnParticle("largesmoke", pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, 0.0D, 0.1D, 0.0D);
		double d0 = (double)pos.getX() + rand.nextDouble();
        double d1 = (double)pos.getY() + rand.nextDouble() * 0.5D + 0.5D;
        double d2 = (double)pos.getZ() + rand.nextDouble();
        worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
    }
	
	
	public int quantityDropped(Random random)
	{
		return 4;
	}

	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return TurdItems.ITEM_TURD;
	}
	
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
		return false;
    }
    
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn)
    {
        
    }
    
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
    {
		return new ItemStack(Item.getItemFromBlock(this));
    	
    }
    
}
