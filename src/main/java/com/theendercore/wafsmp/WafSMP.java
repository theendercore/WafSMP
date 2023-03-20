package com.theendercore.wafsmp;

import com.theendercore.wafsmp.commands.MapCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public final class WafSMP extends JavaPlugin {


    public final Logger LOGGER = getLogger();
    @Override
    public void onEnable() {

        Objects.requireNonNull(this.getServer().getPluginCommand("map")).setExecutor(new MapCommand());
        LOGGER.info("Plugin Loaded");
    }

    @Override
    public void onDisable() {
    }
}
