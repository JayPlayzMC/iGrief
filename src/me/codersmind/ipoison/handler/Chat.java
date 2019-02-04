package me.codersmind.ipoison.handler;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Chat implements Listener {

    List<IListener> listeners = new ArrayList<>();

    @EventHandler
    public void onChat(PlayerChatEvent event) {

        if (event.getMessage().startsWith("~")) {

            event.setCancelled(true);

                if (CommandManager.executeCommand(event.getPlayer(), event.getMessage())) {

                } else {
                    event.getPlayer().sendMessage("§cThis command does not exist");
                }
            } else {

            }
        }



    }

