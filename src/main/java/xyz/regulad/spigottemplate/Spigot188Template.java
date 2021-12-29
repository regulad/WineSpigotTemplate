package xyz.regulad.spigottemplate;

import lombok.Getter;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

public class Spigot188Template extends JavaPlugin {
    @Getter
    private static @Nullable Spigot188Template instance;

    @Override
    public void onEnable() {
        // Setup instance access
        instance = this;
        // Setup bStats metrics
        new Metrics(this, 13741); // TODO: Replace this in your plugin!
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
