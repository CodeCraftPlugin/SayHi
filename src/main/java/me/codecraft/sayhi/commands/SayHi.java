package me.codecraft.sayhi.commands;

import me.codecraft.sayhi.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class SayHi implements CommandExecutor {

    private Main plugin;


    public SayHi(Main plugin) {
        this.plugin = plugin;
        plugin.getCommand("sayhi").setExecutor(this);
    }

    /**
     * Executes the given command, returning its success.
     * <br>
     * If false is returned, then the "usage" plugin.yml entry for this command
     * (if defined) will be sent to the player.
     *
     * @param sender  Source of the command
     * @param command Command which was executed
     * @param label   Alias of the command which was used
     * @param args    Passed command arguments
     * @return true if a valid command, otherwise false
     */
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p  = (Player) sender;
            final ChatColor MY_COLOR = ChatColor.of(new Color(47, 83, 87));
            p.sendMessage(org.bukkit.ChatColor.AQUA+"Hi "+MY_COLOR+p.getDisplayName());
        }else {
            System.out.println("Console can not run this command please get a minecraft and then try again");
        }
        return true;
    }
}
