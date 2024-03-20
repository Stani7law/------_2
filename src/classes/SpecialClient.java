package classes;

import INterface.iActorBehviour;

/** Вип клиент/наследник класса Актор */
public class SpecialClient extends Actor implements iActorBehviour{

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    private int idVip;

    public boolean isTakeOrder(){
        return super.isTakeOrder;
    }

    public boolean isMakeOrder(){
        return super.isMakeOrder;
    }
   
       
    public void setMakeOrder(boolean value) {
       super.isMakeOrder = value;
    }
    public void setTakeOrder(boolean value) {
        super.isTakeOrder = value;
     }

    public Actor getActor(){
        return this;//Возвращает ссылку на самого себя
    }
    @Override
    public String getName() {
        return super.name;
    }
    @Override
    public void setName(String name) {
        super.name = name;
    }

}
