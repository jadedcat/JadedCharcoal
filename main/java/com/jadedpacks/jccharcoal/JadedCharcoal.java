package com.jadedpacks.jccharcoal;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jadedpacks.jadedbase.helpers.OreDictionaryTweaks;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.Basic;
import com.jadedpacks.jadedbase.helpers.Wood.*;

import forestry.api.arboriculture.IWoodItemAccess;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;
import cpw.mods.fml.common.event.FMLLoadCompleteEvent;

@Mod(modid = JadedCharcoal.MODID, version = JadedCharcoal.VERSION, name = JadedCharcoal.NAME,  dependencies = "required-after:Forge@[10.13.3.1384,11.14);" +
		"required-after:JCBase;" + "after:ThermalExpansion;" + "after:Forestry;" + "after:Natura;")
public class JadedCharcoal
{
	public static final String MODID = "JCCharcoal";
	public static final String NAME = "JCCharcoal";
	public static final String VERSION = "1.0.8";
	public static final Logger log = LogManager.getLogger(MODID);
    
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ItemStackHolderInjector.INSTANCE.inject();
		Parts.preInit();
		OreDictionaryTweaks.preInit();
		Basic.preInit();
		if (Loader.isModLoaded("Forestry"))
		{
		Forestry.preInit();
		}
		if (Loader.isModLoaded("Natura"))
		{
		Natura.preInit();
		}
		if (Loader.isModLoaded("ThermalExpansion"))
		{
		ThermalExpansion.preInit();
		}
	}
	@Mod.EventHandler
	public void init (FMLInitializationEvent event)

	{
		if (Loader.isModLoaded("Forestry"))
		{
		Forestry.init();
		}
		if (Loader.isModLoaded("Natura"))
		{
		Natura.init();
		}
		if (Loader.isModLoaded("ThermalExpansion"))
		{
		ThermalExpansion.init();
		}
		Item coal = GameRegistry.findItem("minecraft", "coal");


		ItemStack charcoal   = new ItemStack(coal, 1, 1);
		ItemStack charcoal2   = new ItemStack(coal, 2, 1);
		ItemStack charcoal3   = new ItemStack(coal, 3, 1);
		ItemStack charcoal4   = new ItemStack(coal, 4, 1);
		ItemStack charcoal5   = new ItemStack(coal, 5, 1);
		RecipeRemover.removeFurnaceRecipe(charcoal);

		GameRegistry.addSmelting(Parts.oak , (charcoal2), 0.1F);
		GameRegistry.addSmelting(Parts.birch , (charcoal2), 0.1F);
		GameRegistry.addSmelting(Parts.jungle , (charcoal3), 0.1F);
		GameRegistry.addSmelting(Parts.spruce , (charcoal3), 0.1F);
		GameRegistry.addSmelting(Parts.special , (charcoal4), 0.1F);
		GameRegistry.addSmelting(Parts.darkoak , (charcoal4), 0.1F);

		ItemStackHolderInjector.INSTANCE.inject();
		Parts.init();	
		OreDictionaryTweaks.init();
		Basic.init();

	}

	@Mod.EventHandler
	public void postInit (FMLPostInitializationEvent event)

	{
		ItemStackHolderInjector.INSTANCE.inject();
		Parts.postInit();		
		Basic.postInit();
		if (Loader.isModLoaded("Forestry"))
		{
		Forestry.postInit();
		}
		if (Loader.isModLoaded("Natura"))
		{
		Natura.postInit();
		}
		if (Loader.isModLoaded("ThermalExpansion"))
		{
		ThermalExpansion.postInit();
		}
		
		
		Item coal = GameRegistry.findItem("minecraft", "coal");

		ItemStack charcoal   = new ItemStack(coal, 1, 1);

		RecipeRemover.removeFurnaceRecipe(charcoal);
	}	
	

	@Mod.EventHandler
	public void loadComplete(FMLLoadCompleteEvent event)

	{
		if (Loader.isModLoaded("ThermalExpansion"))
		{
			ThermalExpansion.loadComplete();
		}

	}
}
