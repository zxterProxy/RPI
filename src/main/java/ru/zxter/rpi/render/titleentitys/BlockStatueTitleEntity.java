package ru.zxter.rpi.render.titleentitys;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by zxter on 26.04.2022.
 */
public class BlockStatueTitleEntity extends TileEntity {

    public boolean canUpdate()
    {
        return false;
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt)
    {
        super.readFromNBT(nbt);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbt)
    {
        super.writeToNBT(nbt);
    }

}
