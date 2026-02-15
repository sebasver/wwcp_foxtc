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
import wwcp.client.render.rollingstock.locomotives.diesels.DSBMH;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselDSBMH;

public class EntityDSBMH extends DieselTrain
{
    public EntityDSBMH(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DSB Green");
        InsertTexture(1, "DSB Red and Black");
        InsertTexture(2,"DSB Red and Black MH 374");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 1.15F, 0.3f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.3F;
    }

    @Override
    public String transportCountry() {
        return Transport.ClassMH().country;
    }

    @Override
    public String transportYear() {
        return Transport.ClassMH().year;
    }

    public String getInventoryName() {
        return Transport.ClassMH().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.ClassMH().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselDSBMH;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityDSBMH.class, new DSBMH(),
                        "DSB MH",
                        new float[] { -1.0F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{0.45D, 1.35D, -0.0D});
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
                                texturePath = "textures/locomotive/Diesel/DSBMH/DSBMhGreen.png";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/DSBMH/DSBMhRedBlack.png";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/DSB/DSBRedBlack374.png";
                                break;

                        }

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
