package wwcp.common.entity.locomotives.diesels;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.sounds.SoundRecord;
import wwcp.client.render.rollingstock.locomotives.diesels.FrichsKoef;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselDSBMH;

public class EntityFrichsKoef extends DieselTrain
{
    public EntityFrichsKoef(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB Green");
        InsertTexture(1, "DSB Red/Black");
        InsertTexture(2, "DSB Red");
        InsertTexture(3, "Midtjydske Jernbaner");
    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.2F, -0.32f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.501F;
    }

    @Override
    public String transportCountry() {
        return Transport.FrichsKoef().country;
    }

    @Override
    public String transportYear() {
        return Transport.FrichsKoef().year;
    }

    public String getInventoryName() {
        return Transport.FrichsKoef().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.FrichsKoef().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselDSBMH;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityFrichsKoef.class, new FrichsKoef(),
                        "Frichs Koef",
                        new float[] { -0.98F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{-0.14D, 0.9D, -0.1D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "green":
                                texturePath = "textures/locomotive/Diesel/FrichsKoef/DSBGreen.png";
                                break;
                            case "black":
                                texturePath = "textures/locomotive/Diesel/FrichsKoef/DSBRedBlack.png";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/FrichsKoef/DSBRed.png";
                                break;
                            case "orange":
                                texturePath = "textures/locomotive/Diesel/FrichsKoef/MjbaD.png";
                                break;
                        }

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
