package classes;

import INterface.iActorBehviour;

public class TaxInspector implements iActorBehviour{

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxInspector() {
        this.name = "Налоговый инспектор";
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
}
