package me.artel.essentials.impl;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.util.UUID;

public class IPlayer {
    @Getter
    private Player player;
    @Getter
    private OfflinePlayer offlinePlayer;
    @Getter
    private final UUID playerUUID;
    @Getter
    private String playerUsername;
    @Getter
    private String playerPreviousUsername;
    @Getter
    private String playerDisplayName;

    public IPlayer(UUID playerUUID) {
        this.playerUUID = playerUUID;

        if (Bukkit.getPlayer(playerUUID) != null) {
            this.player = Bukkit.getPlayer(playerUUID);
        } else {
            this.offlinePlayer = Bukkit.getOfflinePlayer(playerUUID);
        }

        
    }
}