package me.woolwars.superinviz.woolwars;

import lombok.Getter;
import me.woolwars.superinviz.woolwars.items.Items;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class SelectTeamArenaOne implements Listener {
    @Getter
    private static Player player = null;

    @EventHandler
    private boolean selectTeam(PlayerInteractEvent event){
        player = event.getPlayer();
        if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK){
            if (!(player.getInventory().getItemInMainHand().hasItemMeta())){
                return false;
            }else if(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Items.redTeam().getItemMeta().getDisplayName())){
                Woolwars.redCommandArenaOne.add(player);
                return true;
            }else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Items.blueTeam().getItemMeta().getDisplayName())){
                Woolwars.blueCommandArenaOne.add(player);
                return true;
            }else return false;
        }
        return true;
    }
}
