package mods.minecraft.darth.dc.command;

import mods.minecraft.darth.dc.lib.Commands;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandDC extends CommandBase
{

    @Override
    public String getCommandName()
    {
        return Commands.COMMAND_DC_ROOT;
    }
    
    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender)
    {
        return true;
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args)
    {
        
        if (args.length > 0)
        {
            
        }
        else
        {
            commandSender.sendChatToPlayer(Commands.COMMAND_MAIN);
        }
        
    }

}
