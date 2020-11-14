package net.md_5.bungee.command;

import java.util.Collection;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

public class CommandPlugins extends Command{
	
    public CommandPlugins()
    {
        super( "bplugins", "bungeecord.command.plugins", "bpl" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
    	sender.sendMessage( new TextComponent( getPluginString() ) );
    }
    
    private String getPluginString() {
    	StringBuilder pluginString = new StringBuilder();
    	Collection<Plugin> pluginList = ProxyServer.getInstance().getPluginManager().getPlugins();
    	for (Plugin plugin : pluginList)
    	{
    		if (pluginString.length() > 1)
    		{
    			pluginString.append(ChatColor.WHITE);
    			pluginString.append(", ");
    		}
    		pluginString.append(ChatColor.GREEN);
    		pluginString.append(plugin.getDescription().getName());
    	}
    	return ChatColor.WHITE + "Plugins (" + pluginList.size() + "): " + ChatColor.WHITE + pluginString.toString();
    }

}
