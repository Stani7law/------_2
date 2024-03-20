package classes;

import java.util.ArrayList;
import java.util.List;

import INterface.iActorBehviour;
import INterface.iMarketBehaviour;
import INterface.iQueueBehavior;
import INterface.iReturnOrder;

/** магазин */
public class Market implements iMarketBehaviour, iQueueBehavior, iReturnOrder {

    private List<iActorBehviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehviour>();
    }

    @Override
    public void acceptToMarket(iActorBehviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehviour actor : queue) {
            if (actor.getActor().isMakeOrder) {
                actor.getActor().isTakeOrder = (true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehviour actor : queue) {
            if (actor.getActor().isTakeOrder) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehviour actor : queue) {
            if (!actor.getActor().isMakeOrder) {
                actor.getActor().isMakeOrder=(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

            }
        }

    }

    @Override
    public void vozvrat() {
        for (iActorBehviour actor : queue){
            if (! actor.getActor().isMakeOrder){
                actor.getActor().isMakeOrder=(true);
                System.out.println( actor.getActor().getName() + "желает вернуть товар");   
            }
        }
        
    }


    @Override
    public void deistvie() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehviour actor : queue) {
            if (actor.getActor().isTakeOrder) {
                releaseActors.add(actor.getActor());
                System.out.println( actor.getActor().getName() + "передумал и хочет приобрести товар");   
            }
        
    }
}
}
