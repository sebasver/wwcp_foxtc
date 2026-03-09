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
import wwcp.client.render.rollingstock.locomotives.diesels.V160_164;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselBR217;


public class EntityBR217 extends DieselTrain
{
    public EntityBR217(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DB Altrot");
        InsertTexture(1, "DB Ozeanblau Beige");
        InsertTexture(2, "DB Orientrot");
        InsertTexture(3, "DB Verkehrsrot");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 6.0F, 0.16f, -0.25f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.025F;
    }

    @Override
    public String transportCountry() {
        return Transport.V162().country;
    }

    @Override
    public String transportYear() {
        return Transport.V162().year;
    }

    public String getInventoryName() {
        return Transport.V162().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.V162().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselBR217;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityBR217.class, new V160_164(),
                        "DB BR 217",
                        new float[] { -2.99F,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{4.7D, 1.7D, 0.195D});
                            }
                            {
                                add(new double[]{3.65D, 1.7D, -0.195D});
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
                                texturePath = "textures/locomotive/Diesel/V160/217/BR217RB";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/V160/217/BR217OB";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/V160/217/BR217OR";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/V160/217/BR217VR";
                                break;

                        }

                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
