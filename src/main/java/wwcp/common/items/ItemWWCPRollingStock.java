package wwcp.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import wwcp.common.core.handler.TypeOfRollingStockWWCP;
import wwcp.common.library.Info;
import wwcp.common.wwcp;

import java.util.ArrayList;
import java.util.List;


public class ItemWWCPRollingStock extends ItemAbstractRollingStock
{
    private final List<String> subtext = new ArrayList<>();

    public ItemWWCPRollingStock(String iconName, TypeOfRollingStockWWCP trainType, String CreativeTab) {
        super(iconName);
        switch (CreativeTab) {
            case "WWCP":
                setCreativeTab(wwcp.WWCP);
                break;
            case "European":
                setCreativeTab(wwcp.European);
                break;
            case "American":
                setCreativeTab(wwcp.America);
                break;
        }
    }

    @Override
    public String GetContentPackName() {
        return "WWCP";
    }

    @Override
    public String GetTexturePath()
    {
        return Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
