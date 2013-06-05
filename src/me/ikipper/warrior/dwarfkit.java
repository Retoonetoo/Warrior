package me.ikipper.warrior;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

public class dwarfkit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("dwarf"))
			;
		Player p = (Player) sender;

		p.getInventory().clear();
		p.setGameMode(GameMode.SURVIVAL);
		p.setHealth(20);

		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "You have choosen the kit: " + ChatColor.YELLOW + "Dwarf");
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "You have been teleported to: " + ChatColor.YELLOW
				+ "Dwarven Cavens");

		ItemStack daxe = new ItemStack(Material.IRON_AXE);
		ItemStack daxe1 = new ItemStack(Material.GOLD_AXE);
		ItemStack dhelm = new ItemStack(Material.IRON_HELMET);
		ItemStack dchest = new ItemStack(Material.IRON_CHESTPLATE);
		ItemStack dlegs = new ItemStack(Material.IRON_LEGGINGS);
		ItemStack dboots = new ItemStack(Material.IRON_BOOTS);

		daxe.addEnchantment(Enchantment.DAMAGE_ALL, 4);
		
		p.getInventory().addItem(daxe);
		p.getInventory().addItem(daxe1);
		p.getInventory().setHelmet(dhelm);
		p.getInventory().setChestplate(dchest);
		p.getInventory().setLeggings(dlegs);
		p.getInventory().setBoots(dboots);
		p.removePotionEffect(PotionEffectType.SPEED);
		p.removePotionEffect(PotionEffectType.JUMP);
		return true;
	}

}
