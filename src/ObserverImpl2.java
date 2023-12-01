public class ObserverImpl2 implements Observer{

    @Override
    public void update(Observable o) {
        System.out.println("Observer 2");

        int state = ((ObservableConcret)o).getState();
        System.out.println("Resultat :" + state * 6);
    }
}
