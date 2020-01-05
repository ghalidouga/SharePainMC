package Events;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class TakeDamage implements Listener {
    @EventHandler
    public void takeDamage (EntityDamageEvent e){
        EntityType player = e.getEntityType();
    }
}
