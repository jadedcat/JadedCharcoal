package com.jadedpacks.jccharcoal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.jadedpacks.jadedbase.helpers.OreDictionaryTweaks;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.Basic;
import com.jadedpacks.jadedbase.helpers.Wood;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public class ThermalExpansion {
	
	public static void preInit() {
		
	}
	
	public static void init ()
	{		
			Item coal = GameRegistry.findItem("minecraft", "coal");


			ItemStack charcoal   = new ItemStack(coal, 1, 1);
			ItemStack charcoal2   = new ItemStack(coal, 2, 1);
			ItemStack charcoal3   = new ItemStack(coal, 3, 1);
			ItemStack charcoal4   = new ItemStack(coal, 4, 1);
			ItemStack charcoal5   = new ItemStack(coal, 5, 1);	
			
			
				//RecipeFurnace(ItemStack input, ItemStack output, int energy) {

				//this.input = input;
				//this.output = output;
				//this.energy = energy;
				NBTTagCompound toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				Parts.oak.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				Parts.birch.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				Parts.jungle.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				Parts.spruce.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				Parts.special.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				toSend.setTag("input", new NBTTagCompound());
				Parts.darkoak.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
				toSend = new NBTTagCompound();


				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				Parts.oak.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//birch = 2
				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal2.writeToNBT(toSend.getCompoundTag("output"));
				Parts.birch.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//jungle = 3
				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				Parts.jungle.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//spruce = 3
				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal3.writeToNBT(toSend.getCompoundTag("output"));
				Parts.spruce.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//special = 4
				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				Parts.special.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();

				//darkoak = 4
				toSend.setInteger("energy", 1600);
				toSend.setTag("input", new NBTTagCompound());
				toSend.setTag("output", new NBTTagCompound());
				charcoal4.writeToNBT(toSend.getCompoundTag("output"));
				Parts.darkoak.writeToNBT(toSend.getCompoundTag("input"));
				FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
				toSend = new NBTTagCompound();
				JadedCharcoal.log.info("JadedTweaks Furnace tweaks loaded");

			
	
	if (Loader.isModLoaded("Forestry"))
		{
			ItemStack flog1a = Wood.acacia;
			ItemStack flog1b = Wood.balsa;
			ItemStack flog1c = Wood.baobab;
			ItemStack flog1d = Wood.cherry;
			ItemStack flog2a = Wood.chesnut;
			ItemStack flog2b = Wood.citrus;
			ItemStack flog2c = Wood.coco;
			ItemStack flog2d = Wood.ebony;
			ItemStack flog3a = Wood.giant;
			ItemStack flog3b = Wood.greenheart;
			ItemStack flog3c = Wood.ipe;
			ItemStack flog3d = Wood.kapok;
			ItemStack flog4a = Wood.larch;
			ItemStack flog4b = Wood.lime;
			ItemStack flog4c = Wood.mahoe;
			ItemStack flog4d = Wood.mahogany;
			ItemStack flog5a = Wood.maple;
			ItemStack flog5b = Wood.padauk;
			ItemStack flog5c = Wood.palm;
			ItemStack flog5d = Wood.papaya;
			ItemStack flog6a = Wood.pine;
			ItemStack flog6b = Wood.plum;
			ItemStack flog6c = Wood.poplar;
			ItemStack flog6d = Wood.sequoia;
			ItemStack flog7a = Wood.teak;
			ItemStack flog7b = Wood.walnut;
			ItemStack flog7c = Wood.wenge;
			ItemStack flog7d = Wood.willow;
			ItemStack flog7e = Wood.zebra;
			
			
			toSend.setTag("input", new NBTTagCompound());
			flog1a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog1b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog1c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog1d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog2a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog2b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog2c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog2d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog3a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog3b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog3c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog3d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog4a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog4b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog4c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog4d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog5a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog5b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog5c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog5d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog6a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog6b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog6c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog6d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog7a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog7b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog7c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setTag("input", new NBTTagCompound());
			flog7d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();
			
			toSend.setTag("input", new NBTTagCompound());
			flog7e.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			//add recipes

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog1a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog1b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog1c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog1d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog2a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog2b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog2c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog2d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog3a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog3b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog3c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog3d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();


			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog4a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog4b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog4c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog4d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog5a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog5b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog5c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal2.writeToNBT(toSend.getCompoundTag("output"));
			flog5d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog6a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog6b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog6c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog6d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog7a.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog7b.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog7c.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();

			toSend.setInteger("energy", 1600);
			toSend.setTag("input", new NBTTagCompound());
			toSend.setTag("output", new NBTTagCompound());
			charcoal3.writeToNBT(toSend.getCompoundTag("output"));
			flog7d.writeToNBT(toSend.getCompoundTag("input"));
			FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
			toSend = new NBTTagCompound();
			}
		
		JadedCharcoal.log.info("Jaded changed the charcoal output of Forestry logs");
		
		if (Loader.isModLoaded("Natura"))
		{
			Item nlog1 = GameRegistry.findItem("Natura", "redwood");
			ItemStack nlog1a = new ItemStack(nlog1, 1, 0);
			ItemStack nlog1b = new ItemStack(nlog1, 1, 1);

			ItemStack nlog2 = GameRegistry.findItemStack("Natura", "willow", 1);

			Item nlog3 = GameRegistry.findItem("Natura", "tree");
			ItemStack nlog3a = new ItemStack(nlog1, 1, 0);
			ItemStack nlog3b = new ItemStack(nlog1, 1, 1);
			ItemStack nlog3c = new ItemStack(nlog1, 1, 2);
			ItemStack nlog3d = new ItemStack(nlog1, 1, 3);

			Item nlog4 = GameRegistry.findItem("Natura", "Rare Tree");
			ItemStack nlog4a = new ItemStack(nlog1, 1, 0);
			ItemStack nlog4b = new ItemStack(nlog1, 1, 1);
			ItemStack nlog4c = new ItemStack(nlog1, 1, 2);
			ItemStack nlog4d = new ItemStack(nlog1, 1, 3);

			ItemStack nlog5 = GameRegistry.findItemStack("Natura", "Dark Tree", 1);

			GameRegistry.addSmelting(nlog1a , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog1b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog2 , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog3a , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog3b , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog3c , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog3d , (charcoal2), 0.1F);
			GameRegistry.addSmelting(nlog4a , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog4b , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog4c , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog4d , (charcoal4), 0.1F);
			GameRegistry.addSmelting(nlog5 , (charcoal3), 0.1F);

		toSend.setTag("input", new NBTTagCompound());
		nlog1a.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog1b.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog2.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog3a.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog3b.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog3c.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog3d.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog4a.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog4b.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog4c.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog4d.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setTag("input", new NBTTagCompound());
		nlog5.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		//add natura log-charcoal
		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog1a.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal2.writeToNBT(toSend.getCompoundTag("output"));
		nlog1b.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog2.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog3a.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog3b.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog3c.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog3d.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog4a.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog4b.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog4c.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();

		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal4.writeToNBT(toSend.getCompoundTag("output"));
		nlog4d.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();


		toSend.setInteger("energy", 1600);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		charcoal3.writeToNBT(toSend.getCompoundTag("output"));
		nlog5.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
		toSend = new NBTTagCompound();
		}
		
		
JadedCharcoal.log.info("Jaded changed the charcoal output of Natura logs");

}
	
	
	public static void postInit() {
		
	}

	public static void loadComplete() {
		
	}

	
}



