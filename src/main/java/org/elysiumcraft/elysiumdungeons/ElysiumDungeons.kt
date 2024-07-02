package org.elysiumcraft.elysiumdungeons

import org.bukkit.plugin.java.JavaPlugin

class ElysiumDungeons : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        // Lets just make it print hello world and run it in a server k?
        logger.info("Hello World!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Bye Bye World!")
    }
}
