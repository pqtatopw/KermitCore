package gq.kermitcraft.kermitcore;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enable");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disable");
    }
}
