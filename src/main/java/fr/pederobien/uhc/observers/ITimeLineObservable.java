package fr.pederobien.uhc.observers;

import java.time.LocalTime;

import fr.pederobien.uhc.task.TimeTask;

public interface ITimeLineObservable {

	void addObserver(LocalTime time, IObsTimeLine obs);

	void removeObserver(LocalTime time, IObsTimeLine obs);

	void notifyObservers(TimeTask task);
}
