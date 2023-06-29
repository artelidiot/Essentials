package me.artel.essentials.impl;

import lombok.Getter;
import org.bukkit.entity.Player;

public class IPlayerData {
    @Getter
    private final Player player;
    @Getter
    private final String playerUUID;

    public IPlayerData(Player player) {
        this.player = player;
        this.playerUUID = player.getUniqueId().toString();
    }
}