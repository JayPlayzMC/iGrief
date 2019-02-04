package me.codersmind.ipoison.handler;

import org.bukkit.entity.Player;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CommandManager {

    private static List<IListener> commands = new ArrayList<>();


    public static void register(IListener iListener) {


        commands.add(iListener);

    }

    public static boolean executeCommand(Player player, String command) {

        String rawCommand = command.substring(1); // Raw command: Command: *help RawCommand: help
        String[] args = rawCommand.split(" ");

        for(IListener iListener : commands) {

            if(rawCommand.split(" ")[0].equalsIgnoreCase(iListener.getName())) {
               iListener.execute(player, args);
                return true;
            }
        }
        return false;




    }

    public static List<IListener> getCommands() {

        return commands;

    }


}
