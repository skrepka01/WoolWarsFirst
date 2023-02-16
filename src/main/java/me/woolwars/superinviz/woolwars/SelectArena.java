package me.woolwars.superinviz.woolwars;

import me.woolwars.superinviz.woolwars.items.Items;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import static me.woolwars.superinviz.woolwars.Woolwars.playerTeleport;
import static me.woolwars.superinviz.woolwars.Woolwars.sendTitle;

public class SelectArena implements Listener {

    private Inventory selectArena = null;

    @EventHandler
    private boolean selectArena(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName() == null) {
                return false;
            } else if (player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(Items.selectArena().getItemMeta().getDisplayName())) {
                selectArena = Bukkit.createInventory(player, 9, "Выбор арены");
                selectArena.addItem(Items.arena1());
                player.openInventory(selectArena);
            }
        }
        return true;
    }

    //Отменить получение предмета из инвенторя
    @EventHandler
    private boolean canselGetItem(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (player.getInventory() == null) {
            return false;
        } else if (player.getInventory().equals(selectArena)) {
            event.setResult(Event.Result.DENY);
            return true;
        }
        return true;
    }

    //Телепорт в лобби
    @EventHandler
    private boolean tpLobby(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (player.getInventory() == null || !(event.getCurrentItem().hasItemMeta())) {
            return false;
        } else if (player.getInventory().equals(selectArena) && event.getCurrentItem().getItemMeta().getDisplayName().equals(Items.arena1().getItemMeta().getDisplayName())) {
            playerTeleport(player, new Location(player.getWorld(), 0.0, 0.0, 0.0));
            sendTitle(player,"Лобби","Вы попали в лобби 1 ");
            return true;
        }
        return true;
    }
}
