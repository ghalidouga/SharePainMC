package ghaliwang.sharepain;

import Events.TakeDamage;
import org.bukkit.plugin.java.JavaPlugin;

public final class SharePain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new TakeDamage(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
