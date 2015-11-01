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

public class Forestry {

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

				if ((Wood.acacia != null))
					
				{
					//stuff for new api
					
					GameRegistry.addSmelting(Wood.acacia , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.balsa , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.baobab , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.cherry , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.chesnut , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.citrus , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.coco , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.ebony , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.greenheart , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.ipe , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.kapok , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.larch , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.lime , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.mahoe , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.maple , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.padauk , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.palm , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.papaya , (charcoal2), 0.1F);
					GameRegistry.addSmelting(Wood.zebra , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.willow , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.pine , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.plum , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.poplar , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.teak , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.walnut , (charcoal3), 0.1F);
					GameRegistry.addSmelting(Wood.giant , (charcoal4), 0.1F);
					GameRegistry.addSmelting(Wood.mahogany , (charcoal4), 0.1F);
					GameRegistry.addSmelting(Wood.sequoia , (charcoal5), 0.1F);
					GameRegistry.addSmelting(Wood.wenge , (charcoal5), 0.1F);
				}
				
				else
					//old forestry compat
				{
				
			Item flog1 = GameRegistry.findItem("Forestry", "log1");
				ItemStack flog1a = new ItemStack(flog1, 1, 0);
				ItemStack flog1b = new ItemStack(flog1, 1, 1);
				ItemStack flog1c = new ItemStack(flog1, 1, 2);
				ItemStack flog1d = new ItemStack(flog1, 1, 3);

				Item flog2 = GameRegistry.findItem("Forestry", "log2");
				ItemStack flog2a = new ItemStack(flog2, 1, 0);
				ItemStack flog2b = new ItemStack(flog2, 1, 1);
				ItemStack flog2c = new ItemStack(flog2, 1, 2);
				ItemStack flog2d = new ItemStack(flog2, 1, 3);

				Item flog3 = GameRegistry.findItem("Forestry", "log3");
				ItemStack flog3a = new ItemStack(flog3, 1, 0);
				ItemStack flog3b = new ItemStack(flog3, 1, 1);
				ItemStack flog3c = new ItemStack(flog3, 1, 2);
				ItemStack flog3d = new ItemStack(flog3, 1, 3);

				Item flog4 = GameRegistry.findItem("Forestry", "log4");
				ItemStack flog4a = new ItemStack(flog4, 1, 0);
				ItemStack flog4b = new ItemStack(flog4, 1, 1);
				ItemStack flog4c = new ItemStack(flog4, 1, 2);
				ItemStack flog4d = new ItemStack(flog4, 1, 3);

				Item flog5 = GameRegistry.findItem("Forestry", "log5");
				ItemStack flog5a = new ItemStack(flog5, 1, 0);
				ItemStack flog5b = new ItemStack(flog5, 1, 1);
				ItemStack flog5c = new ItemStack(flog5, 1, 2);
				ItemStack flog5d = new ItemStack(flog5, 1, 3);

				Item flog6 = GameRegistry.findItem("Forestry", "log6");
				ItemStack flog6a = new ItemStack(flog6, 1, 0);
				ItemStack flog6b = new ItemStack(flog6, 1, 1);
				ItemStack flog6c = new ItemStack(flog6, 1, 2);
				ItemStack flog6d = new ItemStack(flog6, 1, 3);

				Item flog7 = GameRegistry.findItem("Forestry", "log7");
				ItemStack flog7a = new ItemStack(flog7, 1, 0);
				ItemStack flog7b = new ItemStack(flog7, 1, 1);
				ItemStack flog7c = new ItemStack(flog7, 1, 2);
				ItemStack flog7d = new ItemStack(flog7, 1, 3);

				GameRegistry.addSmelting(flog1a , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog1b , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog1c , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog1d , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog2a , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog2b , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog2c , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog2d , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog3a , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog3b , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog3c , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog3d , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog4a , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog4b , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog4c , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog4d , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog5a , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog5b , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog5c , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog5d , (charcoal2), 0.1F);
				GameRegistry.addSmelting(flog6a , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog6b , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog6c , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog6d , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog7a , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog7b , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog7c , (charcoal3), 0.1F);
				GameRegistry.addSmelting(flog7d , (charcoal3), 0.1F);
				}
				
			
			JadedCharcoal.log.info("Jaded made logs require different axes and give more charcoal");
		}

		public static void postInit() {
		}
	}



