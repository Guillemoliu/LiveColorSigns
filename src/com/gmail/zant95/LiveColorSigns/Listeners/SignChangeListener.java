package com.gmail.zant95.LiveColorSigns.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import com.gmail.zant95.LiveColorSigns.FormatTool;
import com.gmail.zant95.LiveColorSigns.LiveColorSigns;

public class SignChangeListener implements Listener {
	LiveColorSigns plugin;

	public SignChangeListener(LiveColorSigns instance) {
		plugin = instance;
	}

	@EventHandler
	public void onSignChange(SignChangeEvent event) {
		event.setLine(0, FormatTool.format(event.getLine(0)));
		event.setLine(1, FormatTool.format(event.getLine(1)));
		event.setLine(2, FormatTool.format(event.getLine(2)));
		event.setLine(3, FormatTool.format(event.getLine(3)));
	}
}