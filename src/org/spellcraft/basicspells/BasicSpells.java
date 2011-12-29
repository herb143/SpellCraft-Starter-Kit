package org.spellcraft.basicspells;

import java.util.logging.Logger;

import org.spellcraft.basicspells.decoy.BasicDecoySpell;
import org.spellcraft.basicspells.decoy.EnhancedDecoySpell;
import org.spellcraft.basicspells.decoy.SuperDecoySpell;
import org.spellcraft.basicspells.net.NetSpell;
import org.spellcraft.basicspells.rapidfire.RapidfireSpell;
import org.spellcraft.basicspells.spike.SpikeFortSpell;
import org.spellcraft.basicspells.spike.SpikeSpell;
import org.spellcraft.basicspells.spike.SpikeWallSpell;
import org.spellcraft.plugin.SpellCraftPlugin;

public class BasicSpells extends SpellCraftPlugin
{
	private Logger log = Logger.getLogger("Minecraft");
	public Logger getLogger() { return log; }
	
	@Override
	public void onDisable()
	{
		getLogger().info("BasicSpells disabled.");
	}

	@Override
	public void onEnable()
	{
		getLogger().info("BasicSpells enabling...");
		
		getSpellCraft().registerSpell(NetSpell.class,this);
		getSpellCraft().registerSpell(SpikeSpell.class,this);
		getSpellCraft().registerSpell(SpikeWallSpell.class,this);
		getSpellCraft().registerSpell(SpikeFortSpell.class,this);
		getSpellCraft().registerSpell(RapidfireSpell.class,this);
		getSpellCraft().registerSpell(BasicDecoySpell.class,this);
		getSpellCraft().registerSpell(EnhancedDecoySpell.class,this);
		getSpellCraft().registerSpell(SuperDecoySpell.class,this);
		
		
		getLogger().info("BasicSpells enabled.");
		
	}
	
}
