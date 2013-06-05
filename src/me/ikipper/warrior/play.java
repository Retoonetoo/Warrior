package me.ikipper.warrior;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class play implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("play"))
			;
		Player p = (Player) sender;
		Location loc = new Location(Bukkit.getWorld("world"), 345, 116, -790);
		p.teleport(loc);
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "You are now at the start lobby!");
		return true;
	}

}
