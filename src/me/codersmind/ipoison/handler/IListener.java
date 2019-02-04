package me.codersmind.ipoison.handler;

import org.bukkit.entity.Player;

public interface IListener {

    public void execute(Player player, String[] args);
    public String getName();

}
