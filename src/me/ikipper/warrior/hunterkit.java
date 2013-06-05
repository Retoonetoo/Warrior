package me.ikipper.warrior;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class hunterkit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if (commandLabel.equalsIgnoreCase("hunter"))
			;
		Location loc = new Location(Bukkit.getWorld("world"), 244, 150, -783);
		Player p = (Player) sender;

		p.getInventory().clear();
		p.setGameMode(GameMode.SURVIVAL);
		p.setHealth(20);

		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "You have choosen the kit: " + ChatColor.YELLOW + "Sniper");
		sender.sendMessage(ChatColor.WHITE + "[" + ChatColor.BLUE + "Warrior"
				+ ChatColor.WHITE + "] " + ChatColor.RED
				+ "You have been teleported to: " + ChatColor.YELLOW
				+ "Sniper Ridge");

		ItemStack hsword = new ItemStack(Material.STONE_SWORD);
		ItemStack hsword1 = new ItemStack(Material.STONE_SWORD);
		ItemStack hfish = new ItemStack(Material.COOKED_FISH);
		ItemStack hhelm = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemStack hchest = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemStack hlegs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemStack hboot = new ItemStack(Material.CHAINMAIL_BOOTS);
		
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta imeta = item.getItemMeta();
		List<String> ll = new ArrayList<String>();
	    ll.add("line");
		imeta.setLore(ll);
		imeta.setDisplayName("The great and mighty bow!");

		item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
		item.addEnchantment(Enchantment.ARROW_INFINITE, 1);
		hsword.addEnchantment(Enchantment.KNOCKBACK, 1);
		hhelm.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
		hchest.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
		hlegs.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
		hboot.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 2);
		
		p.getInventory().addItem(item);
		p.removePotionEffect(PotionEffectType.SPEED);
		p.removePotionEffect(PotionEffectType.JUMP);
		p.getInventory().addItem(hsword1);
		p.getInventory().addItem(new ItemStack(Material.ARROW));
		p.getInventory().addItem(hfish);
		p.getInventory().addItem(hfish);
		p.getInventory().addItem(hfish);
		p.getInventory().addItem(hfish);
		p.getInventory().addItem(hfish);
		p.getInventory().setHelmet(hhelm);
		p.getInventory().setChestplate(hchest);
		p.getInventory().setLeggings(hlegs);
		p.getInventory().setBoots(hboot);
		p.teleport(loc);
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED,
				Integer.MAX_VALUE, 0));
		p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP,
				Integer.MAX_VALUE, 0));
		p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1200,
				10));

		return true;
	}
}
