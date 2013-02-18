package com.gmail.zant95.LiveColorSigns;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.zant95.LiveColorSigns.Listeners.SignChangeListener;

public class LiveColorSigns extends JavaPlugin {

	@Override
	public void onEnable() {

		//Implement listeners
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new SignChangeListener(this), this);

		this.getLogger().info("LiveColorSigns enabled!");
	}

	@Override
	public void onDisable() {
		this.getLogger().info("Goodbye LiveColorSigns!");
	}
}
