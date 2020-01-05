package Events;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Collection;

public class TakeDamage implements Listener {
    @EventHandler
    public void takeDamage (EntityDamageEvent e){
        EntityType player = e.getEntityType();
        double finalDamage = e.getFinalDamage();
        for (Player p : Bukkit.getServer().getOnlinePlayers()){
            if(player.equals(EntityType.PLAYER)){
                double health = p.getHealth();
                p.setHealth(health-finalDamage);


            }
        }

    }
}
