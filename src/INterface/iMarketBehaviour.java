package INterface;

import java.util.List;

import classes.Actor;

/**Интерфейс/Поведение в магазине */
public interface iMarketBehaviour {
    /** Приём в магазине */
    public void acceptToMarket(iActorBehviour actor);
    public void releaseFromMarket(List<Actor> actors);

    public void update();
}
