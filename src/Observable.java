public interface Observable {

    public void addObserver(Observer O) ;
    public void removeObserver(Observer O) ;
    public void notifyObservers() ;
}
