package ParkingLot.models;

import ParkingLot.models.enums.GateStatus;
import ParkingLot.models.enums.GateType;

public class Gate extends BaseModel {
    private int gameNo;
    private Operator operator;
    private GateType gateType;
    private GateStatus gateStatus;

    public int getGameNo() {
        return gameNo;
    }

    public void setGameNo(int gameNo) {
        this.gameNo = gameNo;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
