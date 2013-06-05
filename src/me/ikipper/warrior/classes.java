package me.ikipper.warrior;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class classes implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("classes"))
			;
		sender.sendMessage(ChatColor.WHITE + "--------------------"
				+ ChatColor.AQUA + "[Warrior Classes]" + ChatColor.WHITE
				+ "------------------");
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "Hunter: " + ChatColor.GOLD + "/hunter");
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "Dwarf: " + ChatColor.GOLD + "/dwarf");
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "Knight: " + ChatColor.GOLD + "/knight");
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "Dwarf: " + ChatColor.GOLD + "/dwarf");
		sender.sendMessage(ChatColor.WHITE + "--------------------"
				+ ChatColor.AQUA + "[Warrior Classes]" + ChatColor.WHITE
				+ "------------------");
		return true;
	}

}
