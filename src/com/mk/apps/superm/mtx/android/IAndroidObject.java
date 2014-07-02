package com.mk.apps.superm.mtx.android;

public interface IAndroidObject {

	/**
	 * Get main ad controller that controls sub ad controllers
	 * */
	public IAdController getAdController();

	/**
	 * Get android intents
	 * */
	public IAndroidIntents getAndroidIntents();

	/**
	 * Get "Score Loop"
	 * */
	public IScoreLoop getScoreLoop();
}
