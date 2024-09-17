package dev.felleto.fboardmain;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Fboard_main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("[fBoard] Plugin iniciado");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[fBoard] Plugin desligado");
    }
}
