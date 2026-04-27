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
import wwcp.client.render.rollingstock.locomotives.steamers.German.BR01.DB_BR01;
import wwcp.client.render.rollingstock.locomotives.steamers.German.BR01.DB_BR01_Henschel;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityDBBR01_henschel extends SteamTrain {

    public EntityDBBR01_henschel(World world) {
        super(world, LiquidManager.WATER_FILTER);
        InsertTexture(0, "ChristmasBR01");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.2f, 0.2f, -0.15f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.75F;
    }

    @Override
    public String transportCountry() {
        return Transport.DBBR01Henschel().country;
    }

    @Override
    public String transportYear() {
        return Transport.DBBR01Henschel().year;
    }

    public String getInventoryName() {
        return Transport.DBBR01Henschel().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DBBR01Henschel().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDBBR01_henschel.class, new DB_BR01_Henschel(),
                        "DBBR01",
                        new float[]{-3f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},

                        null, "largesmoke", new ArrayList<double[]>() { {add(new double[] { 5.5D, 1.7D, 0.0D }); }},
                        "explode", new ArrayList<double[]>() { { add(new double[] { 5.5D, -0.1875D, 0.6875D }); }}, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/locomotive/Steam/BR01/DBBR01/BR01_Henschel";
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
