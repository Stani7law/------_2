package classes;

import INterface.iActorBehviour;

/**Обычный клиент/Наследник класса Актор*/ 
public class OrdinariClient extends Actor implements iActorBehviour{
// Дабавить коструктор
/**Обычный клиент */
    public OrdinariClient(String name) {
        super(name);
        
    }

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
