package wwcp.common.core.handler;

public enum TypeOfRollingStockWWCP {

    STEAM("STEAM"),
    DIESEL("DIESEL"),
    ELECTRIC("ELETRIC"),
    PASSENGER("PASSENGER"),
    FREIGHT("FREIGHT"),
    BOOSE("BOOSE"),
    UNIVERSAL("UNIVERSAL"),
    BAGGAGE("BAGGAGE"),
    TENDER("TENDER"),
    EMPTY("");

    public final String EnumTypeOfRollingStockWWCP;

    private TypeOfRollingStockWWCP(String EnumTypeOfRollingStockWWCP) {
        this.EnumTypeOfRollingStockWWCP = EnumTypeOfRollingStockWWCP;
    }
}
