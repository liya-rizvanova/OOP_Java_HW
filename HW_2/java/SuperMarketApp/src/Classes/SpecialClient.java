package Classes;

import java.util.List;

import Interfaces.iRefundBehaviour;
import Utils.Logger;

public class SpecialClient extends Actor implements iRefundBehaviour {

    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

   
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void refundOrder(List<Actor> actors) {
        // Реализация возврата товара для специального клиента
    }

    public void returnOrder() {
        // Реализация возврата товара для специального клиента
        Logger.log(getName() + " специальный клиент вернул товар ");
    }
}