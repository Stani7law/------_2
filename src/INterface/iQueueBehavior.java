package INterface;



/**Интерфейс/Поведение в очереди */
public interface iQueueBehavior {
    /**Занять место в очереди */
    void takeInQueue(iActorBehviour actor);
    /**Покинуть место очереди */
    void releaseFromQueue();
    /**Забрать заказ */
    void takeOrder();
    /**Сделать заказ */
    void giveOrder();

}
