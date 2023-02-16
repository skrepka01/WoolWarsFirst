package me.woolwars.superinviz.woolwars;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public final class Woolwars extends JavaPlugin {
    //TODO : PULLREQUEST ON GIT(CREATE MASTER BRANCH AND POINT)
    public static List<Player> playerOnArenaOne;
    //Разделение арен
    public static List<Player> redCommandArenaOne;
    public static List<Player> blueCommandArenaOne;

    //Разделение арен
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerJoinOnServer(), this);
        getServer().getPluginManager().registerEvents(new SelectArena(), this);
        getServer().getPluginManager().registerEvents(new SelectTeamArenaOne(), this);
        getServer().getPluginManager().registerEvents(new StartGame(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void playerTeleport(Player player, Location location) {
        player.teleport(location);
    }

    public static void displayNameItem(Player player) {
        player.getInventory().getItemInMainHand().getItemMeta().getDisplayName();
    }

    public static boolean addItemInInv(Player player, ItemStack itemStack) {
        player.getInventory().addItem(itemStack);
        return true;
    }

    public static void sendTitle(Player player, String msg, String msg1) {
        player.sendTitle(msg, msg1);
    }
}
