package mods.minecraft.darth.dc.command;

import mods.minecraft.darth.dc.lib.Commands;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

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
            commandSender.sendChatToPlayer(ChatMessageComponent.func_111077_e(Commands.COMMAND_MAIN));
        }
        
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        // TODO Auto-generated method stub
        return null;
    }

}
