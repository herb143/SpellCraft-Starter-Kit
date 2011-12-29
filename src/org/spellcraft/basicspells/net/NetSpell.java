package org.spellcraft.basicspells.net;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.craftbukkit.entity.CraftCaveSpider;
import org.bukkit.craftbukkit.entity.CraftChicken;
import org.bukkit.craftbukkit.entity.CraftCow;
import org.bukkit.craftbukkit.entity.CraftCreeper;
import org.bukkit.craftbukkit.entity.CraftEnderDragon;
import org.bukkit.craftbukkit.entity.CraftEnderman;
import org.bukkit.craftbukkit.entity.CraftFish;
import org.bukkit.craftbukkit.entity.CraftGhast;
import org.bukkit.craftbukkit.entity.CraftGiant;
import org.bukkit.craftbukkit.entity.CraftMonster;
import org.bukkit.craftbukkit.entity.CraftPig;
import org.bukkit.craftbukkit.entity.CraftPigZombie;
import org.bukkit.craftbukkit.entity.CraftSheep;
import org.bukkit.craftbukkit.entity.CraftSilverfish;
import org.bukkit.craftbukkit.entity.CraftSkeleton;
import org.bukkit.craftbukkit.entity.CraftSlime;
import org.bukkit.craftbukkit.entity.CraftSnowman;
import org.bukkit.craftbukkit.entity.CraftSpider;
import org.bukkit.craftbukkit.entity.CraftSquid;
import org.bukkit.craftbukkit.entity.CraftVillager;
import org.bukkit.craftbukkit.entity.CraftWolf;
import org.bukkit.craftbukkit.entity.CraftZombie;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.spellcraft.SpellCraft;
import org.spellcraft.castable.TargetingSpell;

public class NetSpell extends TargetingSpell {

	protected int range = 30;
	private int radius = 10;

	public NetSpell(SpellCraft instance, Player playerinstance)
	{
		super(playerinstance,instance,"Net","Freezes all life in 10-block radius for 10 seconds.",new ItemStack(Material.STRING,10));
	}


	protected void freezeNearby(LivingEntity center, int range)
	{
		SpellCraft plugin = getSpellCraft();
		
		List<Entity> nearbyMobs = center.getNearbyEntities(range * 2, (range * 2), (range*2) );
		ArrayList<Block> frozenBlocks = new ArrayList<Block>();
		for (Entity currentMob : nearbyMobs) // Scroll through every entity in the list.
		{
			if(isOf(currentMob, CraftCaveSpider.class,CraftChicken.class,CraftCow.class,CraftCreeper.class,CraftEnderDragon.class,CraftEnderman.class,CraftFish.class,CraftGhast.class,CraftGiant.class,CraftMonster.class,CraftPig.class,CraftPigZombie.class,CraftSheep.class,CraftSilverfish.class,CraftSkeleton.class,CraftSlime.class,CraftSnowman.class,CraftSpider.class,CraftSquid.class,CraftVillager.class,CraftWolf.class,CraftZombie.class))
			{
				Block frozenBlock = currentMob.getLocation().getWorld().getBlockAt(currentMob.getLocation());
				frozenBlocks.add(frozenBlock);
				frozenBlock.setType(Material.WEB);
			}
		}
		
		plugin.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new NetRunnable(frozenBlocks), (200));
	}

	protected void castSpell(LivingEntity target)
	{
		freezeNearby(target,radius);
	}
}