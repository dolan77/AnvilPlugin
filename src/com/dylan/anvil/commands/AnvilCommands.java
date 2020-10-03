package com.dylan.anvil.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.dylan.anvil.events.AnvilEvents;

public class AnvilCommands implements CommandExecutor {
    /**
     *
     * @param sender
     * @param cmd
     * @param label
     * @param args
     * @return
     */

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // checks if the sender is the console, we return true
        if (!(sender instanceof Player)) {return true;}

        // command for /anvil
        if (cmd.getName().equalsIgnoreCase("anvil")) {
            //not sure what to do next

        }
        return true;
    }
}
