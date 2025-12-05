package wwcp.common.core.handler;

import train.common.Traincraft;
import train.common.library.EnumTrainType;
import train.common.library.register.TrainRecord;
import wwcp.common.entity.locomotives.EntityWWCPShopShunter;
import wwcp.common.library.AddonPackItems;
import wwcp.common.library.AddonRollingStockItems;
import wwcp.common.wwcp;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return wwcp.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(AddonRollingStockItems.WWCPShopShunter.item,
                                                    new TrainRecord(AddonRollingStockItems.WWCPShopShunter.name(), EntityWWCPShopShunter.class, AddonRollingStockItems.WWCPShopShunter.item, "freight", 1,
                                                            new String[] {"Red"}, 18, 0, .95, 164, 4120, 60, 160,
                                                            0.65, -2, 10000),
                                                    Instance()
                                            );
    }
}
