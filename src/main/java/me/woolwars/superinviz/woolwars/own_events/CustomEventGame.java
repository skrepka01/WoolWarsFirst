package me.woolwars.superinviz.woolwars.own_events;

import me.woolwars.superinviz.woolwars.SelectTeamArenaOne;
import me.woolwars.superinviz.woolwars.Woolwars;
import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


import static me.woolwars.superinviz.woolwars.Woolwars.*;

public class CustomEventGame extends Event {

    @Override
    public HandlerList getHandlers() {
        return null;
    }

    public void startGame() {
        if (Woolwars.playerOnArenaOne.size() == 2 && redCommandArenaOne.size() == 1 && blueCommandArenaOne.size() == 1) {
            if (redCommandArenaOne.contains(SelectTeamArenaOne.getPlayer())) {
                playerTeleport(SelectTeamArenaOne.getPlayer(), new Location(SelectTeamArenaOne.getPlayer().getWorld(), 0.0, 0.0, 0.0));
            } else if (blueCommandArenaOne.contains(SelectTeamArenaOne.getPlayer())) {
                playerTeleport(SelectTeamArenaOne.getPlayer(), new Location(SelectTeamArenaOne.getPlayer().getWorld(), 0.1, 0.1, 0.1));
            }
        } else if (playerOnArenaOne.size() == 2 && redCommandArenaOne.size() == 0 || blueCommandArenaOne.size() == 0) {
            if (redCommandArenaOne.size() == 0) {
                redCommandArenaOne.add(SelectTeamArenaOne.getPlayer());
            } else if (blueCommandArenaOne.size() == 0) {
                blueCommandArenaOne.add(SelectTeamArenaOne.getPlayer());
            }
        }
    }
}
