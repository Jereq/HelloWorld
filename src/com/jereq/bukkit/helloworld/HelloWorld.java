
package com.jereq.bukkit.helloworld;

import com.jereq.bukkit.helloworld.commands.*;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin {
	
	public void onDisable() {
		// TODO Auto-generated method stub
	}

	public void onEnable() {

        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
        
        getCommand("hello").setExecutor(new HelloPluginCommand(this));
	}
	
}