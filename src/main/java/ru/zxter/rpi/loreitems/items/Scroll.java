package ru.zxter.rpi.loreitems.items;

import com.google.common.base.Objects;
import cpw.mods.fml.common.registry.GameRegistry;
import minefantasy.mf2.api.knowledge.InformationBase;
import minefantasy.mf2.api.knowledge.InformationPage;
import minefantasy.mf2.api.knowledge.ResearchArtefacts;
import minefantasy.mf2.api.rpg.SkillList;
import minefantasy.mf2.knowledge.KnowledgeListMF;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.zxter.rpi.main;
import ru.zxter.rpi.proxy.CommonProxy;
import ru.zxter.rpi.register.BlockReg;
import ru.zxter.rpi.register.ItemReg;
import sun.net.www.content.image.gif;

import static net.minecraft.init.Blocks.grass;

public class Scroll extends Item {
    public Scroll(String name, String texture) {
        GameRegistry.registerItem(this, name);
        setUnlocalizedName(name);
        setTextureName(main.MODID + ":" + texture);
        setCreativeTab(CommonProxy.mytab);
        setMaxDamage(100);

    }

}