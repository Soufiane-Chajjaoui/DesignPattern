public class Main {
    public static void main(String[] args) {
        ObservableConcret sujet = new ObservableConcret();
        ObserverImpl1 obs1 = new ObserverImpl1();
        sujet.addObserver(obs1);
         ObserverImpl2 obs2 = new ObserverImpl2();
        sujet.addObserver(obs2);
        sujet.setState(10);
        sujet.setState(1);
        sujet.removeObserver(obs1);
        sujet.setState(3);

    }
}