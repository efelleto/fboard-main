package dev.felleto.fboardmain;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fboard_main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(" &7-----------------------------------------\n");
        Bukkit.getConsoleSender().sendMessage(" &f| &afBoard Plugin\n");
        Bukkit.getConsoleSender().sendMessage(" &f| Author: &aEduardo Felleto");
        Bukkit.getConsoleSender().sendMessage(" &f| Version: &a1.0.0\n");
        Bukkit.getConsoleSender().sendMessage(" &7-----------------------------------------\n");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(" &cfBoard desligado!\n");
    }
}
