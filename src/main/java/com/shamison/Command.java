package com.shamison;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by shamison on 15/11/13.
 */
public class Command implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender,
                             org.bukkit.command.Command command,
                             String s,
                             String[] args) {

        /* /demo コマンド*/
        if(command.getName().equalsIgnoreCase("demo")){
            commandSender.sendMessage("sucess");
            /* /demo 1 を使う*/
            if(args[0].equalsIgnoreCase("1"))
                commandSender.sendMessage("111!");
            /* /demo 2 を使う*/
            else if(args[0].equalsIgnoreCase("2"))
                commandSender.sendMessage("222!");

            return true;
        }

        return false;
    }
}
