package me.woolwars.superinviz.woolwars;

import me.woolwars.superinviz.woolwars.own_events.CustomEventGame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class StartGame implements Listener {

    @EventHandler
    private void start(CustomEventGame eventStartGame){
        eventStartGame.startGame();
    }
}
