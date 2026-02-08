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
import wwcp.client.render.rollingstock.locomotives.diesels.G322;
import wwcp.common.core.handler.Transport;

import java.util.ArrayList;

import static wwcp.common.core.handler.EnumSoundsWWCP.locoDieselG322;

public class EntityG322 extends DieselTrain
{
    public EntityG322(World world) {
        super(world, LiquidManager.dieselFilter());
        InsertTexture(0, "DB RED");
        InsertTexture(1, "DB Yellow");
        InsertTexture(2,"DSB Yellow");
        InsertTexture(3,"DSB 625");
        InsertTexture(4,"Mittelweserbahn");
        InsertTexture(5,"NRail G322");
        InsertTexture(6,"NRail G400B");
        InsertTexture(7,"NS G400B");
        InsertTexture(8,"NT G400B");
        InsertTexture(9,"VFST G322");
        InsertTexture(10,"VFST G400B");

    }

    public void updateRiderPosition() {
        TraincraftUtil.updateRider(this, 0.4F, 0.3f, -0.3f);
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 1.25F;
    }

    @Override
    public String transportCountry() {
        return Transport.ClassMK().country;
    }

    @Override
    public String transportYear() {
        return Transport.ClassMK().year;
    }

    public String getInventoryName() {
        return Transport.ClassMK().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.ClassMK().fictional;
    }

    public SoundRecord getSoundRecord() {
        return locoDieselG322;
    }

    @Override
    public void onRenderInsertRecord()
    {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityG322.class, new G322(),
                        "G322",
                        new float[] { -1f,0.15F,0.0F },
                        new float[] { 0F, 180F, 180F },
                        null,
                        "smoke",
                        new ArrayList<double[]>() {
                            {
                                add(new double[]{1D, 1.5D, -0.25D});
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
                                texturePath = "textures/locomotive/Diesel/G322-400B/MKYellowDSB.png";
                                break;
                            case "red":
                                texturePath = "textures/locomotive/Diesel/G322-400B/MKYellowDB.png";
                                break;
                            case "green":
                                texturePath = "textures/locomotive/Diesel/G322-400B/MKDBRed.png";
                                break;
                            case "brown":
                                texturePath = "textures/locomotive/Diesel/G322-400B/MKYellowDSB625.png";
                                break;
                            case "blue":
                                texturePath = "textures/locomotive/Diesel/G322-400B/MWBG322.png";
                                break;
                            case "white":
                                texturePath = "textures/locomotive/Diesel/G322-400B/NRail322.png";
                                break;
                            case "lime":
                                texturePath = "textures/locomotive/Diesel/G322-400B/NRail400B.png";
                                break;
                            case "magenta":
                                texturePath = "textures/locomotive/Diesel/G322-400B/NSG400B.png";
                                break;
                            case "lightgrey":
                                texturePath = "textures/locomotive/Diesel/G322-400B/NTG400B.png";
                                break;
                            case "grey":
                                texturePath = "textures/locomotive/Diesel/G322-400B/VFSTG322.png";
                                break;
                            case "pink":
                                texturePath = "textures/locomotive/Diesel/G322-400B/VSFTG400B.png";
                                break;

                        }

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
