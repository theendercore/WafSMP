package com.theendercore.wafsmp;

import com.theendercore.wafsmp.commands.MapCommand;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public final class WafSMP extends JavaPlugin {


    public final Logger LOGGER = LoggerFactory.getLogger(WafSMP.class.getSimpleName());
    public static FileConfiguration config;

    @Override
    public void onEnable() {
        config = getConfig();
        config.addDefault("mapURL", "http://wafflessmp.apexmc.co:7652/");
        config.options().copyDefaults(true);
        saveConfig();

       this.getServer().getPluginCommand("map").setExecutor(new MapCommand());
        LOGGER.info("Plugin Loaded");
    }

    @Override
    public void onDisable() {
    }
}
