package com.shamison;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by shamison on 15/11/13.
 */
public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("enable plugin...");
        getLogger().info("Hello!");
        getCommand("demo").setExecutor(new Command());

    }

    @Override
    public void onDisable() {
        getLogger().info("disable plugin...");
    }
}
