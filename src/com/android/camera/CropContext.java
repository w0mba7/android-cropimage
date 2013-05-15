package com.android.camera;

public interface CropContext extends MonitoredContext {

	public abstract boolean isWaitingToPick();

	public abstract void setWaitingToPick(boolean waiting);

	public abstract boolean isSaving();

	public abstract void setCrop(HighlightView crop);

}