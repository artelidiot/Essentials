package me.artel.essentials;

import lombok.Getter;
import me.artel.essentials.commands.essentials.EssentialsCommand;
import me.artel.essentials.listeners.BlockListeners;
import me.artel.essentials.listeners.EntityListeners;
import me.artel.essentials.listeners.PlayerListeners;
import me.artel.essentials.managers.FileManager;
import me.artel.feather.integration.Wrapper;
import org.bukkit.plugin.java.JavaPlugin;

public class EssentialsPlugin extends JavaPlugin {
    @Getter
    private static JavaPlugin plugin;

    @Override
    public void onLoad() {
        plugin = this;
    }

    @Override
    public void onEnable() {
        FileManager.init();

        Wrapper.init()
                .registerCommand(plugin, "essentials", new EssentialsCommand())
                .registerListener(plugin, new BlockListeners())
                .registerListener(plugin, new EntityListeners())
                .registerListener(plugin, new PlayerListeners());
    }
}