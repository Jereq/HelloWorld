package com.jereq.bukkit.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.jereq.bukkit.helloworld.HelloWorld;

public class HelloPluginCommand implements CommandExecutor {
	//private final HelloWorld plugin;
	
	public HelloPluginCommand(HelloWorld plugin) {
		//this.plugin = plugin;
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		sender.sendMessage("Hello World!");
		return true;
	}
	
}