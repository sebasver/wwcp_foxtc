package wwcp.common.entity.locomotives.steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.EnumSounds;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.steamers.DSBFIII;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityDSBFIII extends SteamTrain {

    public EntityDSBFIII(World world) {
        super(world, LiquidManager.WATER_FILTER);
        InsertTexture(0, "DSB F III");


    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.2f, -0.0f, -0.15f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.185F;
    }

    @Override
    public String transportCountry() {
        return Transport.DSBFIII().country;
    }

    @Override
    public String transportYear() {
        return Transport.DSBFIII().year;
    }

    public String getInventoryName() {
        return Transport.DSBFIII().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DSBFIII().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSBFIII.class, new DSBFIII(),
                        "DSB F III",
                        new float[]{-1.0f,0.15F,0.0F},
                        new float[]{0F, 180F, 180F},

                        null, "largesmoke", new ArrayList<double[]>() { {add(new double[] { 2.46D, 1.4D, 0.0D }); }},
                        "explode", new ArrayList<double[]>() { { add(new double[] { 2.16D, -0.1875D, 0.6875D }); }}, 10, 2)

                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Steam/DSBFIII/FIII";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }

    @Override
    public SoundRecord getSoundRecord() {
        return EnumSounds.locoSteamBR01_DB;
    }
}
