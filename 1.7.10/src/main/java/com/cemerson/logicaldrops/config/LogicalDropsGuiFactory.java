package com.cemerson.logicaldrops.config;

import java.util.Set;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.IModGuiFactory.RuntimeOptionCategoryElement;
import cpw.mods.fml.client.IModGuiFactory.RuntimeOptionGuiHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

public class LogicalDropsGuiFactory implements IModGuiFactory {

	  @Override
	  public void initialize(Minecraft minecraftInstance) {

	  }

	  @Override
	  public Class<? extends GuiScreen> mainConfigGuiClass() {
	    return LogicalDropsConfigGUI.class;
	  }

	  @Override
	  public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() {
	    return null;
	  }

	  @Override
	  public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) {
	    return null;
	  }	
	
}
