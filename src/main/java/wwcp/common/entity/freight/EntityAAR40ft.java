package wwcp.common.entity.freight;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFixedFreightCar;
import wwcp.client.render.rollingstock.freight.AAR40ftStandardBoxcar;
import wwcp.common.core.handler.Transport;

public class EntityAAR40ft extends AbstractStandardFixedFreightCar {

    public EntityAAR40ft(World world) {
        super(world);
    }

    @Override
    public void setupTextureDescription()
    {
        InsertTexture(0, "WP");
        InsertTexture(1, "WP Feather");
        InsertTexture(2, "CB&Q Red");
        InsertTexture(3, "NP");
        InsertTexture(4, "SP&S");
        InsertTexture(5, "RI");
        InsertTexture(6, "SLSF");
        InsertTexture(7, "CP Script");
        InsertTexture(8, "TH&B");
        InsertTexture(9, "CN Noodle");
    }

    public float getOptimalDistance(EntityMinecart cart) {
        return 2.95F;
    }

    @Override
    public String transportCountry() {
        return Transport.AAR40ft().country;
    }

    @Override
    public String transportYear() {
        return Transport.AAR40ft().year;
    }

    public String getInventoryName() {
        return Transport.AAR40ft().name;
    }

    @Override
    public boolean isFictional() {
        return Transport.AAR40ft().fictional;
    }

    @Override
    public void onRenderInsertRecord() {
        Traincraft.traincraftRegistry.RegisterRollingStockModel(
                new TrainRenderRecord(wwcp.common.library.Info.modID,
                        EntityAAR40ft.class, new AAR40ftStandardBoxcar(),
                        "AAR40ft",
                        new float[]{-0.0f, 0.15F, 0.0F},
                        new float[]{0F, 180F, 180F},
                        null) {
                    @Override
                    public ResourceLocation getTextureFile(String colorAsString) {
                        String texturePath = "";
                        switch (colorAsString.toLowerCase()) {
                            case "black":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_WP_N";
                                break;
                            case "red":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_WP_Feather";
                                break;
                            case "green":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_CBQ";
                                break;
                            case "brown":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_NP";
                                break;
                            case "blue":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_SPS";
                                break;
                            case "purple":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_RI";
                                break;
                            case "cyan":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_SLSF_N";
                                break;
                            case "lightgrey":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_CP_Script";
                                break;
                            case "pink":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_THB";
                                break;
                            case "lime":
                                texturePath = "textures/freightskins/Boxcar_40ft/40ft_AAR_Standard_Boxcar_CN";
                                break;

                        }
                        texturePath += ".png";

                        return new ResourceLocation(wwcp.common.library.Info.modID, texturePath);
                    }
                });
    }
}
