package com.oftx.entityspawneffect;

import org.bukkit.plugin.java.JavaPlugin;

public class EntitySpawnEffect extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EntitySpawnListener(), this);
        getLogger().info("MyPlugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("MyPlugin has been disabled.");
    }
}