package fr.pederobien.uhc.observers;

public interface ITimeTaskObservable {

	void addObserver(IObsTimeTask obs);

	void removeObserver(IObsTimeTask obs);

	void notifyObservers();
}
