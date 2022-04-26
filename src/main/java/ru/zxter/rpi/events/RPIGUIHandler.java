package ru.zxter.rpi.events;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ru.zxter.rpi.gui.AcGui;
import ru.zxter.rpi.gui.ContainerAcGui;
import ru.zxter.rpi.register.BlockReg;
import ru.zxter.rpi.register.GuiReg;


/**
 * Created by zxter on 26.04.2022.
 */
public class RPIGUIHandler implements IGuiHandler{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
     //   TileEntity entity = world.getTileEntity(x,y,z);
     if(ID == GuiReg.guiIDAc){
        return ID == GuiReg.guiIDAc && world.getBlock(x,y,z) == BlockReg.ac ? new ContainerAcGui(player.inventory,world,x,y,z) : null;
    }
     return null;
   }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        if(ID == GuiReg.guiIDAc){
            return ID == GuiReg.guiIDAc && world.getBlock(x,y,z) == BlockReg.ac ? new AcGui(player.inventory,world,x,y,z) : null;

        }

        return null;
    }
}
