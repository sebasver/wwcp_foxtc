package wwcp.common.core.handler;

import train.common.library.sounds.SoundRecord;
import wwcp.common.entity.locomotives.diesels.*;
import wwcp.common.entity.locomotives.steam.EntityDSBFII;
import wwcp.common.entity.locomotives.steam.EntityDSBFIII;

public class EnumSoundsWWCP {
    public static final SoundRecord locoDieselG322 = new SoundRecord(EntityG322.class, "wwcp:G322Horn", 0.8F, "wwcp:G322_Run_Mid", 0.65F, 60, "wwcp:G322_Run_Idle", 0.65F, 40, true, " ", 0);
    public static final SoundRecord locoDieselDSBMH = new SoundRecord(EntityDSBMH.class, "wwcp:DSBMH_Whistle", 0.8F, "wwcp:FM_38D_6_Notch8", 0.25F, 100, "wwcp:FM_38D_6_Idle", 0.15F, 40, true, " ", 0);
    public static final SoundRecord locoDieselBR215 = new SoundRecord(EntityBR215.class, "wwcp:V160_horn", 0.8F, "wwcp:218_2_Run", 0.65F, 50, "wwcp:218_2_Idle", 0.65F, 40, true, " ", 0);
    public static final SoundRecord locoDieselBR217 = new SoundRecord(EntityBR217.class, "wwcp:V160_horn", 0.8F, "wwcp:218_1_Run", 0.65F, 65, "wwcp:218_1_Idle", 0.65F, 44, true, " ", 0);
    public static final SoundRecord locoDieselBR218_1 = new SoundRecord(EntityBR218_1.class, "wwcp:V160_horn", 0.8F, "wwcp:218_1_Run", 0.65F, 40, "wwcp:218_1_Idle", 0.65F, 40, true, " ", 0);
    public static final SoundRecord locoDieselBR218_2 = new SoundRecord(EntityBR218_2.class, "wwcp:V160_horn", 0.8F, "wwcp:218_2_Run", 0.65F, 40, "wwcp:218_2_Idle", 0.65F, 40, true, " ", 0);
    public static final SoundRecord locoDieselDSBMT = new SoundRecord(EntityDSBMT.class, "wwcp:DSBMH_Whistle", 0.8F, "wwcp:FM_38D_6_Notch8", 0.25F, 100, "wwcp:FM_38D_6_Idle", 0.15F, 40, true, " ", 0);
    public static final SoundRecord locoSteamDSBFII = new SoundRecord(EntityDSBFII.class, "wwcp:DSBSteam_Whistle", 0.8F, "wwcp:DSBSteam_Run", 0.35F, 40, "wwcp:DSBSteam_Idle", 0.15F, 34, true, " ", 0);
    public static final SoundRecord locoSteamDSBFIII = new SoundRecord(EntityDSBFIII.class, "wwcp:DSBSteam_Whistle", 0.8F, "wwcp:DSBSteam_Run", 0.35F, 40, "wwcp:DSBSteam_Idle", 0.15F, 34, true, " ", 0);


}
