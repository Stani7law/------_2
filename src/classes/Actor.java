package classes;
/**Это абстрактный класс АКТОР-Клиент */
public abstract class Actor {
/**ИМЯ */
    protected String name;
    /**Принять заказ */
    protected boolean isTakeOrder;
    /**Сделать заказ */
    protected boolean isMakeOrder;
    /** Конструктор Actor */
    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();// Если метод абстрактный - ничего не передается
    

    abstract public void setName(String name) ;
           


}
