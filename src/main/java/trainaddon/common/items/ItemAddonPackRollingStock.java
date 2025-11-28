package trainaddon.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import trainaddon.common.wwcp;


public class ItemAddonPackRollingStock  extends ItemAbstractRollingStock
{
    public ItemAddonPackRollingStock(String iconName, TypeOfRollingStock trainType)
    {
        super(iconName);
        setCreativeTab(wwcp.Germany);
    }

    @Override
    public String GetContentPackName() {
        return null;
    }

    @Override
    public String GetTexturePath()
    {
        return trainaddon.common.library.Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
