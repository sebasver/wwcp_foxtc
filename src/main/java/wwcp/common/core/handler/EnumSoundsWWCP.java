package wwcp.common.core.handler;

import train.common.library.sounds.SoundRecord;
import wwcp.common.entity.locomotives.diesels.*;

public class EnumSoundsWWCP {
    public static final SoundRecord locoDieselG322 = new SoundRecord(EntityG322.class, "wwcp:G322Horn", 0.8F, "wwcp:G322_Run_Mid", 0.65F, 6, "wwcp:G322_Run_Idle", 0.65F, 6, true, " ", 0);
    public static final SoundRecord locoDieselDSBMH = new SoundRecord(EntityG322.class, "wwcp:DSBMH_Whistle", 0.8F, "wwcp:FM_38D_6_Notch8", 0.25F, 15, "wwcp:FM_38D_6_Idle", 0.15F, 15, true, " ", 0);
}
