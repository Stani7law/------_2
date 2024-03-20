package INterface;

import classes.Actor;

/** Интерфейс/ поведение актёра */
public interface iActorBehviour {

    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean val);

    public void setMakeOrder(boolean val);

    public Actor getActor();

}
