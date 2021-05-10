package ru.zxter.rpi.entitys;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import ru.zxter.rpi.main;

/**
 * Created by zxter on 05.02.2021.
 */
public class Fog extends TileEntity {
    int state;
    int tick = 0;

    public Fog() {
        setState(0);
    }

    public boolean isInCollisionAction() {
        return state == 1;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void updateEntity() {
        AxisAlignedBB block = AxisAlignedBB.getBoundingBox(this.xCoord, this.yCoord, this.zCoord, this.xCoord + 1, this.yCoord + 1, this.zCoord + 1);
        super.updateEntity();
        tick++;
        if (tick > 40) tick = 0;
        if (!this.worldObj.isRemote) {
            if (isInCollisionAction()) {
                Entity l[] = (Entity[]) this.worldObj.getLoadedEntityList().toArray(new Entity[0]);
                boolean find = false;
                for (Entity e : l) {
                    if (e instanceof EntityPlayer) {
                        if (block.intersectsWith(e.boundingBox)) {
                            find = true;
                        }
                    }
                }
                if (!find && state == 1) {
                    System.out.println("collision ended");
                    worldObj.playSoundEffect(xCoord, yCoord, zCoord, main.MODID + ":" + "ambient.fog_2", 3.5F, 1.5F);

                    setState(0);
                }
            } else {
                if (tick == 0) {
                    if (state == 1)
                        System.out.println("Collided");
                    else if (state == 0)
                        System.out.println("Not collided");
                }
            }
        }
    }
}

