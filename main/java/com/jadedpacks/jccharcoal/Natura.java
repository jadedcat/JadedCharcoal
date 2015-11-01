package com.jadedpacks.jccharcoal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import com.jadedpacks.jadedbase.helpers.OreDictionaryTweaks;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.Basic;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.registry.GameRegistry;

public class Natura {	
	
	public static void preInit() {
		// TODO Auto-generated method stub
		
	}
	
public static void init ()

{
			Item coal = GameRegistry.findItem("minecraft", "coal");


			ItemStack charcoal   = new ItemStack(coal, 1, 1);
			ItemStack charcoal2   = new ItemStack(coal, 2, 1);
			ItemStack charcoal3   = new ItemStack(coal, 3, 1);
			ItemStack charcoal4   = new ItemStack(coal, 4, 1);
			ItemStack charcoal5   = new ItemStack(coal, 5, 1);
	
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

}
}

public static void postInit() {
}
}
