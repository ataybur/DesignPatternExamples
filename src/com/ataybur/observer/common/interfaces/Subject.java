package com.ataybur.observer.common.interfaces;

public interface Subject {
	public void subscribeObserver(Observer observer);

	public void unSubscribeObserver(Observer observer);

	public void notifyObservers();

	public String subjectDetails();
}
