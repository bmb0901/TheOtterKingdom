package com.otter.items;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@EventBusSubscriber(modid = "otter")
public class ModItems {
	
	public static Item otter_fur = new Item().setRegistryName("otter","otter_fur").setUnlocalizedName("otter_fur");
	public static Item cured_otter_fur =  new Item().setRegistryName("otter","cured_otter_fur").setUnlocalizedName("cured_otter_fur");
	public static Item otter_fire_scepter = new Item().setRegistryName("otter","otter_scepter").setUnlocalizedName("otter_fire_scepter");
	
	@SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(otter_fur, cured_otter_fur, otter_fire_scepter);
    }
}
