package com.android.camera;

public interface CropContext extends MonitoredContext {

	public static final String EXTRA_ASPECT_X = "aspectX";
	public static final String EXTRA_ASPECT_Y = "aspectY";
	public static final String EXTRA_OUTPUT_X = "outputX";
	public static final String EXTRA_OUTPUT_Y = "outputY";
	public static final String EXTRA_BITMAP_DATA = "data";
	public static final String EXTRA_SCALE_UP_IF_NEEDED = "scaleUpIfNeeded";
	public static final String EXTRA_SCALE = "scale";
	public static final String EXTRA_NO_FACE_DETECTION = "noFaceDetection";
	public static final String EXTRA_SET_WALLPAPER = "setWallpaper";
	public static final String EXTRA_OUTPUT_FORMAT = "outputFormat";
	public static final String EXTRA_SOURCE = "source";

	public abstract boolean isWaitingToPick();

	public abstract void setWaitingToPick(boolean waiting);

	public abstract boolean isSaving();

	public abstract void setCrop(HighlightView crop);

}