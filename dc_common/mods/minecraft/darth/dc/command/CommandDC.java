package mods.minecraft.darth.dc.command;

import java.util.List;

import mods.minecraft.darth.dc.lib.Commands;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.entity.Entity;

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
    @SuppressWarnings("rawtypes")
    public List addTabCompletionOptions(ICommandSender commandSender, String[] args)
    {
        switch (args.length)
        {
            case 1:
                return getListOfStringsMatchingLastWord(args, new String[] {Commands.COMMAND_KILL_ENTITIES});
            default:
                return null;
        }
    }
    
    @Override
    public void processCommand(ICommandSender commandSender, String[] args)
    {
        
        if (args.length > 0)
        {
            String commandName = args[0];
            System.arraycopy(args, 1, args, 0, args.length - 1);
            
            if (commandName.equalsIgnoreCase(Commands.COMMAND_KILL_ENTITIES))
            {
                for (int x = 0;x < 10000;x++)
                {
                    Entity entity = commandSender.func_130014_f_().getEntityByID(x);
                    
                    if (entity != null)
                        commandSender.func_130014_f_().removeEntity(entity);
                }
            }
            else
                throw new WrongUsageException(Commands.COMMAND_MAIN_ERROR, new Object[0]);
        }
        else
            commandSender.sendChatToPlayer(ChatMessageComponent.func_111077_e(Commands.COMMAND_MAIN));
        
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return null;
    }

}
