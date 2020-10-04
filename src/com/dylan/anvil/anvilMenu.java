// Build  -> Build Artifacts -> Build to update plugin with new code
package com.dylan.anvil;

import com.dylan.anvil.commands.AnvilCommands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

// this is main

// class extends something means that the anvilMenu(A) extends JavaPlugin(B) means that A is the child class of
// B and B is the parent to A. AnvilMenu inherits all the public methods,instance variables and constructors of B.
// methods in child class A can be overwritten from parent class B. If not child A would follow instructions from B.

public class anvilMenu extends JavaPlugin {
    @Override
    public void onEnable(){
        // creates a new class that is set to the variable anvilCommands
        AnvilCommands anvilCommands = new AnvilCommands();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[anvilMenu] is enabled!");
        getCommand("anvil").setExecutor(anvilCommands);
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[anvilMenu] is disabled!");
    }
}
