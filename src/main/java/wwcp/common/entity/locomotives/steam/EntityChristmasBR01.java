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
import wwcp.client.render.rollingstock.locomotives.steamers.German.ChristmasBR01;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

public class EntityChristmasBR01 extends SteamTrain {

    public EntityChristmasBR01(World world) {
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
        return Transport.DRBR01WitteChristmas().country;
    }

    @Override
    public String transportYear() {
        return Transport.DRBR01WitteChristmas().year;
    }

    public String getInventoryName() {
        return Transport.DRBR01WitteChristmas().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.DRBR01WitteChristmas().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityChristmasBR01.class, new ChristmasBR01(),
                        "ChristmasBR01",
                        new float[]{-3f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},

                        null, "largesmoke", new ArrayList<double[]>() { {add(new double[] { 5.5D, 1.7D, 0.0D }); }},
                        "explode", new ArrayList<double[]>() { { add(new double[] { 5.5D, -0.1875D, 0.6875D }); }}, 10, 2)

                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "yellow":
                                texturePath = "textures/passengerstock/ChristmasStock/ChristmasBR01";
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
