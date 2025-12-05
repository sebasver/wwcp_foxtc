package wwcp.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import wwcp.common.library.Info;
import wwcp.common.wwcp;


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
        return Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
