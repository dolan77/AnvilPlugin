package com.dylan.anvil.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class AnvilCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // checks if the sender is the console, we return true
        if (!(sender instanceof Player)) {return true;}

        // command for /anvil
        if (cmd.getName().equalsIgnoreCase("anvil")) {
            // creates a player variable from the one who is writing down the command
            Player player = (Player) sender;

            // creates an Inventory variable called anvilMenu and that variable is set to the InventoryType Anvil
            Inventory anvilMenu = Bukkit.createInventory(player, InventoryType.ANVIL);

            // opens the player's inventory, which in this case is the anvil
            player.openInventory(anvilMenu);


        }
        return true;
    }
}
