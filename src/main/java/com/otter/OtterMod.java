package com.otter;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "otter")
public class OtterMod {
	
	@Instance
	public static OtterMod instance;
	
    @SidedProxy(clientSide="com.otter.ClientProxy", serverSide="com.otter.ServerProxy")
    public static IProxy proxy;
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);

	}
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}