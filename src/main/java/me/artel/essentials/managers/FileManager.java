package me.artel.essentials.managers;

import me.artel.essentials.EssentialsPlugin;
import me.artel.feather.files.YAMLFile;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class FileManager {
    private static final JavaPlugin plugin = EssentialsPlugin.getPlugin();
    private static final YAMLFile config = new YAMLFile(plugin, "config.yml");
    private static final YAMLFile locale = new YAMLFile(plugin, "locale.yml");
    private static final YAMLFile warps = new YAMLFile(plugin, "warps.yml");

    public static void init() {
        config.save();
        locale.save();
        warps.save();
    }

    public static YamlConfiguration getConfig() {
        return config.getYaml();
    }

    public static YamlConfiguration getLocale() {
        return locale.getYaml();
    }

    public static YamlConfiguration getWarps() {
        return warps.getYaml();
    }
}