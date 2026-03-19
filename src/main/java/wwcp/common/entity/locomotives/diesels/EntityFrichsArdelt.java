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
import wwcp.client.render.rollingstock.locomotives.diesels.FrichsArdelt;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselDSBMH;

public class EntityFrichsArdelt extends DieselTrain
{
    public EntityFrichsArdelt(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB Green");
        InsertTexture(1, "DSB Green 2");
        InsertTexture(2, "DSB Green 3");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, -0.125F, 0.125f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 0.95F;
    }

    @Override
    public String transportCountry() {
        return Transport.FrichsArdelt().country;
    }

    @Override
    public String transportYear() {
        return Transport.FrichsArdelt().year;
    }

    public String getInventoryName() {
        return Transport.FrichsArdelt().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.FrichsArdelt().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselDSBMH;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityFrichsArdelt.class, new FrichsArdelt(),
                        "Frichs Ardelt",
                        new float[] { -0.98F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0.6D, 1.25D, -0.175D});
                            }},
                        "", null, 10, 2)
                {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString)
                    {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase())
                        {
                            case "black":
                                texturePath = "textures/locomotive/Diesel/FrichsArdelt/DSBGreen.png";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/FrichsArdelt/DSBGreen2.png";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/FrichsArdelt/DSBGreen3.png";
                                break;

                        }

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
