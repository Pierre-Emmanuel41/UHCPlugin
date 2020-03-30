package fr.pederobien.uhc.task;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.pederobien.uhc.observers.IObsTimeLine;
import fr.pederobien.uhc.observers.IObsTimeTask;
import fr.pederobien.uhc.observers.ITimeLineObservable;

public class TimeLine implements ITimeLineObservable, IObsTimeTask {
	private Map<LocalTime, List<IObsTimeLine>> observers;

	public TimeLine(TimeTask task) {
		observers = new HashMap<>();
		task.addObserver(this);
	}

	@Override
	public void addObserver(LocalTime time, IObsTimeLine obs) {
		if (observers.containsKey(time))
			observers.get(time).add(obs);
		else {
			List<IObsTimeLine> list = new ArrayList<IObsTimeLine>();
			list.add(obs);
			observers.put(time, list);
		}
	}

	@Override
	public void removeObserver(LocalTime time, IObsTimeLine obs) {
		observers.get(time).remove(obs);
		if (observers.get(time).size() == 0)
			observers.remove(time);
	}

	@Override
	public void timeChanged(TimeTask task) {
		notifyObservers(task);
	}

	@Override
	public void notifyObservers(TimeTask task) {
		List<IObsTimeLine> list = observers.get(task.getIncreasingTime());

		// When there are no observers
		if (list == null)
			return;

		for (IObsTimeLine obs : list)
			obs.time(task.getIncreasingTime());
	}
}
