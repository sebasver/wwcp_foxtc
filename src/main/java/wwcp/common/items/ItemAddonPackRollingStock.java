package wwcp.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import wwcp.common.library.Info;
import wwcp.common.wwcp;

import javax.xml.validation.TypeInfoProvider;
import java.util.ArrayList;
import java.util.List;


public class ItemAddonPackRollingStock extends ItemAbstractRollingStock
{
    private final List<String> subtext = new ArrayList<>();

    public ItemAddonPackRollingStock(String iconName, TypeOfRollingStock trainType)
    {
        super(iconName);
        setCreativeTab(wwcp.WWCP);
    }

    public ItemAddonPackRollingStock(String iconName, TypeOfRollingStock trainType, String CreativeTab) {
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
