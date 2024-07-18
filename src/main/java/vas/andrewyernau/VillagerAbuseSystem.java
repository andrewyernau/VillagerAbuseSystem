package vas.andrewyernau;

import org.bukkit.Bukkit;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("ALL")
public class VillagerAbuseSystem extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent event) {
        if (event.getRightClicked() instanceof Villager) {
            Villager villager = (Villager) event.getRightClicked();
            if (villager.getProfession() != Villager.Profession.NONE) {
                if (villager.getVillagerLevel() == 1) {
                    villager.setVillagerExperience(1);
                }
            }
        }
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
