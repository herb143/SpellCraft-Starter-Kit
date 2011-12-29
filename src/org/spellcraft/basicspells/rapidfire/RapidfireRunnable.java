package org.spellcraft.basicspells.rapidfire;

import org.bukkit.entity.Player;

public class RapidfireRunnable implements Runnable {
	
	private Player player;
	
	public RapidfireRunnable(Player instance)
	{
		player = instance;
	}
	
	public void run()
	{
		player.shootArrow();
	}
	
}
