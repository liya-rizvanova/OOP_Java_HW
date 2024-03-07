package Classes;

import java.util.List;

import Interfaces.iRefundBehaviour;
import Utils.Logger;

public class OrdinaryClient extends Actor implements iRefundBehaviour {

    public OrdinaryClient(String name) {
        super(name);
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
        // Реализация возврата товара для обычного клиента
    }    

    public void refundOrder() {
        // Реализация возврата товара для обычного клиента
        Logger.log(getName() + " клиент вернул товар ");
    }
}