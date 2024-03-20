package classes;

import INterface.iActorBehviour;
import INterface.iReturnOrder;
/**Класс Акционного клиента */
public class ActionClient implements iActorBehviour, iReturnOrder{

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;
    /**Название акций */
    private String actionName;
    /**id клиента */
    private int idClient;
    /** Количество участников в акции */
    private int countActionClient;

    public ActionClient(){
        this.name = "Акционный клиент";
    }
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getCountActionClient() {
        return countActionClient;
    }

    public void setCountActionClient(int countActionClient) {
        this.countActionClient = countActionClient;
    }

        
    public boolean isTakeOrder(){
        return isTakeOrder;
    }

    public boolean isMakeOrder(){
        return isMakeOrder;
    }
   
       
    public void setMakeOrder(boolean value) {
       isMakeOrder = value;
    }
    public void setTakeOrder(boolean value) {
       isTakeOrder = value;
     }

   
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Actor getActor(){
        return new OrdinariClient(getName());
    }
    @Override
    public void vozvrat() {
        System.out.println( this.name + "желает вернуть товар");   
    }


    @Override
    public void deistvie() {
        System.out.println( this.name + "передумал и хочет приобрести товар");   
    }


}
