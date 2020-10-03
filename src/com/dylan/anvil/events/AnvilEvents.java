package com.dylan.anvil.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

public class AnvilEvents implements Listener {

    @EventHandler
    public static void onAnvilInventory(PrepareAnvilEvent anvil){
        anvil.getInventory();

    }
}
