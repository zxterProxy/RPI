package ru.zxter.rpi.mobs;


import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import ru.zxter.rpi.register.WeaponReg;

/**
 * Created by zxter on 28.01.2021.
 */

public class Savage extends EntityMob
{
    public Savage(World world)
    {
        super(world);
        setSize(1.6F, 2.0F);
        super.addRandomArmor();
        this.setCurrentItemOrArmor(0, new ItemStack(WeaponReg.brokenshestoper));
    }


    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);

    }

}