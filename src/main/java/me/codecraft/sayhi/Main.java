package me.codecraft.sayhi;

import me.codecraft.sayhi.commands.SayHi;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Sayhi Loaded");
        new SayHi(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Sayhi Shutdown");
    }
}
