package wwcp.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import wwcp.common.library.Info;
import wwcp.common.wwcp;


public class ItemWWCPCrafting extends Item
{
    protected String iconName = "";
    protected String folder = "parts";

    public ItemWWCPCrafting(String iconName){
        this.iconName = iconName;
        this.setMaxStackSize(64);
        this.setCreativeTab(wwcp.WWCP);
    }

    public ItemWWCPCrafting overridePath(String newFolder){
        this.folder = newFolder;
        return this;
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon(Info.modID + ":" + this.folder + "/" + this.iconName);
    }

}
