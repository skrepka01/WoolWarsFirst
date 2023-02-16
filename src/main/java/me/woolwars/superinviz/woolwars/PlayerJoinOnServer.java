package me.woolwars.superinviz.woolwars;

import me.woolwars.superinviz.woolwars.items.Items;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import static me.woolwars.superinviz.woolwars.Woolwars.addItemInInv;
import static me.woolwars.superinviz.woolwars.Woolwars.playerTeleport;

public class PlayerJoinOnServer implements Listener {

    @EventHandler
    public void playerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage("");
        playerTeleport(player, new Location(player.getWorld(), 0.0,0.0,0.0));
        addItemInInv(player,new ItemStack(Items.selectArena()));
    }
}
