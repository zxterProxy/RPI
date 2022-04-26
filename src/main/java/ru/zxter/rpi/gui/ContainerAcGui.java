package ru.zxter.rpi.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.*;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.zxter.rpi.crafting.AsCraftManager;
import ru.zxter.rpi.register.BlockReg;

/**
 * Created by zxter on 25.04.2022.
 */
public class ContainerAcGui extends Container {
    public InventoryCrafting craftMatryx;
    public IInventory craftResult;
    private World worldObj;
    private int posX;
    private int posY;
    private int posZ;

    public ContainerAcGui(InventoryPlayer invPlayer, World world, int x, int y, int z){

        craftMatryx = new InventoryCrafting(this,5,5);
        craftResult = new InventoryCraftResult();
        worldObj = world;
        posX = x;
        posY = y;
        posZ = z;

        this.addSlotToContainer(new SlotCrafting(invPlayer.player, craftMatryx,craftResult, 0, 131,36));
        for(int i = 0; i<5; i++){
            for(int k = 0; k<5; k++){
                this.addSlotToContainer(new Slot(craftMatryx, k + i * 5, 4 + k * 18, 3 + i * 18));
            }
        }

        // Вроде как цикл обычного инвентаря игрока ( я хуй знает )
        for (int i = 0; i <3; i++){
            for (int k = 0; k < 9; k++ ){
                this.addSlotToContainer(new Slot(invPlayer, k + i * 9 + 9, 8 + k * 18, 106 + i  * 18 ));
            }
        }

        for (int i = 0; i < 9; i++){

            this.addSlotToContainer(new Slot(invPlayer, i, 8 + i * 18 , 166));
        }

        onCraftMatrixChanged(craftMatryx);
    }


    public void onCraftMatrixChanged(IInventory iiventory){

        craftResult.setInventorySlotContents(0, AsCraftManager.getInstance().findMatchingRecipe(craftMatryx,worldObj));
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        if (worldObj.getBlock(posX,posY,posZ) != BlockReg.ac){
            return false;
        }else{
            return player.getDistanceSq((double)posX + 0.5D,(double)posY+ 0.5D,(double)posZ+ 0.5D) <= 64.0D;
        }

    }

    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ == 0)
            {
                if (!this.mergeItemStack(itemstack1, 10, 46, true))
                {
                    return null;
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            else if (p_82846_2_ >= 10 && p_82846_2_ < 37)
            {
                if (!this.mergeItemStack(itemstack1, 37, 46, false))
                {
                    return null;
                }
            }
            else if (p_82846_2_ >= 37 && p_82846_2_ < 46)
            {
                if (!this.mergeItemStack(itemstack1, 10, 37, false))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 10, 46, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize)
            {
                return null;
            }

            slot.onPickupFromSlot(p_82846_1_, itemstack1);
        }

        return itemstack;
    }

    /**
     * Called when the container is closed.
     */
    public void onContainerClosed(EntityPlayer p_75134_1_)
    {
        super.onContainerClosed(p_75134_1_);

        if (!this.worldObj.isRemote)
        {
            for (int i = 0; i < 9; ++i)
            {
                ItemStack itemstack = this.craftMatryx.getStackInSlotOnClosing(i);

                if (itemstack != null)
                {
                    p_75134_1_.dropPlayerItemWithRandomChoice(itemstack, false);
                }
            }
        }
    }
}
