package fr.pederobien.uhc.task;

public interface ITaskLauncher {

	void run(long delay, long period);

	void pause();

	void cancel();

	void relaunched();

	TimeTask getTask();
}
