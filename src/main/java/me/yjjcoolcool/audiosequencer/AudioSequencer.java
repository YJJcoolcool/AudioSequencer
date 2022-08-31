package me.yjjcoolcool.audiosequencer;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class AudioSequencer extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getLogger().info(ChatColor.AQUA+"AudioSequencer Plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getLogger().info(ChatColor.AQUA+"AudioSequencer Plugin has been disabled. Thanks for using!");
    }
}
