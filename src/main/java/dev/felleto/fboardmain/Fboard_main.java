package dev.felleto.fboardmain;

import io.github.thatkawaiisam.assemble.Assemble;
import io.github.thatkawaiisam.assemble.AssembleAdapter;
import io.github.thatkawaiisam.assemble.AssembleStyle;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Fboard_main extends JavaPlugin {

    @Override
    public void onEnable() {
        Assemble assemble = new Assemble(this, new AssembleAdapter() {
            @Override
            public String getTitle(Player player) {
                return ChatColor.AQUA + "fBoard";
            }

            @Override
            public List<String> getLines(Player player) {

                List<String> linhas = new ArrayList<>();

                linhas.add("");
                linhas.add("IGN: " + player.getDisplayName());
                linhas.add("");
                linhas.add(Instant.now().toString());
                linhas.add("");
                linhas.add(ChatColor.ITALIC + "github.com/efelleto");

                return linhas;
            }
        });

        assemble.setAssembleStyle(AssembleStyle.VIPER);
        Bukkit.getConsoleSender().sendMessage("[fBoard] Plugin iniciado");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[fBoard] Plugin desligado");
    }
}
