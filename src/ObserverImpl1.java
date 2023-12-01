public class ObserverImpl1 implements Observer{
    @Override
    public void update(Observable o) {
        System.out.println("Observer 1");
         int state = ((ObservableConcret)o).getState();
        System.out.println("Resultat :" + state * 3);
    }
}
