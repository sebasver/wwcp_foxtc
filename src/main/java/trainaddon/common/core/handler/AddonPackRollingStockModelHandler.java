package trainaddon.common.core.handler;

import trainaddon.common.library.Info;

public class AddonPackRollingStockModelHandler
{
    /**
     * Only setup Model Register calls from here or you will crash the server.
     */
    public AddonPackRollingStockModelHandler()
    {
        final String ModID = Info.modID;
        /* SAMPLE
        Traincraft.traincraftRegistry
                  .RegisterRollingStockModel
                          (new TrainRenderRecord(modID,
                          EntityPassengerBlue.class, new ModelPassenger6(),
                          "passenger", -- This is what the texture folder is called and what a texture must start with
                          new float[] { 0.0F, -0.47F, 0.0F },
                          null,
                          null)
         */

        // Put Calls to RegisterRollingStockModel below this.

    }
}
