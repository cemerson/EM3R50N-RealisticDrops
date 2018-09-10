package com.cemerson.logicaldrops.init;

import com.cemerson.logicaldrops.Reference;

import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;

// import net.minecraftforge.common.crafting.CraftingHelper;

import jline.internal.Log;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
// 
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.ModContainer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import net.minecraftforge.registries.IForgeRegistry;


import net.minecraft.init.PotionTypes;
import net.minecraft.potion.PotionType;
import net.minecraft.potion.PotionUtils;

public class LogicalRecipes {
	
	//public static RealismItem item_bone_cow;
		
	public static void init(){			
//		// item_food_eggs_mushroom_omelette = (RealismItem) new RealismItem(20,1.0F,false,"Mushroom & Cheese Omelette",false).setUnlocalizedName("item_food_eggs_mushroom_omelette").setRegistryName("item_food_eggs_mushroom_omelette").setMaxStackSize(8);
//		item_bone_cow = (RealismItem) new RealismItem("Cow Bone")
//							.setRegistryName("item_bone_cow")
//							.setUnlocalizedName("item_bone_cow")
//							.setMaxStackSize(64);									
	}
	
	public static void register(){	
		//GameRegistry.register(item_bone_cow);
	
//		EntityRegistry.registerModEntity(RealismCow.class, "LogicalDrops Cow", 1, Reference.MOD_ID, 128, 1, false);
//		// EntityRegistry.registerModEntity(RealismCow.class, "LogicalDrops Cow", 1, null, 128, 1, false, 0, 0);
						        		
//        MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());		
		
//		// GameRegistry.register(item_food_eggs_sandwich_fried);			
//		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint), 
//				new Object[]{
//						Blocks.gravel,Blocks.gravel,Blocks.gravel,						
//						Blocks.gravel,Blocks.gravel,Blocks.gravel});		
				
// 			GameRegistry.addSmelting(item_food_bread, new ItemStack(item_food_toast), 2.0F);
	}
	
	public static void registerRenders(){				
		//registerRender(item_bone_cow);
	}
	
	public static void registerRender(Item item){
						
		Minecraft.getMinecraft()
		.getRenderItem()
		.getItemModelMesher()
		.func_178086_a(item, 0, new ModelResourceLocation(
				Reference.MOD_ID + ":" + item.getTranslationKey().substring(5),
				"inventory"));		
				
	}
	

}
