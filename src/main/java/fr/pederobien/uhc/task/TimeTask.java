package fr.pederobien.uhc.task;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import fr.pederobien.uhc.observers.IObsTimeTask;
import fr.pederobien.uhc.observers.ITimeTaskObservable;

public class TimeTask implements ITimeTaskObservable {
	private LocalTime totalTime, increasingTime, decreasingTime, pauseTime, limitTime;
	private List<IObsTimeTask> observers;
	private boolean pause;

	private void initialize(LocalTime time) {
		observers = new ArrayList<IObsTimeTask>();
		totalTime = increasingTime = pauseTime = LocalTime.of(0, 0, 0);
		decreasingTime = limitTime = time;
		pause = false;
	}

	public TimeTask(LocalTime gameTime) {
		initialize(gameTime);
	}

	public TimeTask(String gameTime) {
		initialize(LocalTime.parse(gameTime));
	}

	public void run() {
		notifyObservers();
		if (!pause) {
			increasingTime = increasingTime.plusSeconds(1);
			decreasingTime = decreasingTime.minusSeconds(1);
		} else
			pauseTime = pauseTime.plusSeconds(1);
		totalTime = totalTime.plusSeconds(1);
	}

	public void cancel() {
		initialize(limitTime);
	}

	/**
	 * Tell the timetask to stop or not the time in the timetask. If the task is running then it stop. If the task is stopped then it
	 * run.
	 * 
	 * @return True if the task is stopped, false if the task is running.
	 */
	public void pause() {
		pause = true;
	}

	public void relaunched() {
		pause = false;
	}

	/**
	 * Add an observer to the list of {@link IObsTimeTask} of the task.
	 * 
	 * @param obs The observer to add to the list.
	 */
	@Override
	public void addObserver(IObsTimeTask obs) {
		observers.add(obs);
	}

	/**
	 * Remove the observer from the list of {@link IObsTimeTask} of the task.
	 * 
	 * @param obs The observer to remove.
	 */
	@Override
	public void removeObserver(IObsTimeTask obs) {
		observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for (IObsTimeTask obs : observers)
			obs.timeChanged(this);
	}

	public LocalTime getTotalTime() {
		return totalTime;
	}

	public LocalTime getIncreasingTime() {
		return increasingTime;
	}

	public LocalTime getDecreasingTime() {
		return decreasingTime;
	}

	public LocalTime getPauseTime() {
		return pauseTime;
	}
}
