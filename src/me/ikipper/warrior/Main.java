package me.ikipper.warrior;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getCommand("play").setExecutor(new play());
		getCommand("classes").setExecutor(new classes());
		getCommand("hunter").setExecutor(new hunterkit());
		getCommand("dwarf").setExecutor(new dwarfkit());

	}

	@Override
	public void onDisable() {
		
	}
		
	@EventHandler 
	public void death(PlayerDeathEvent e) { 
	e.setDroppedExp(0); e.getDrops().clear(); 
	}
}
