package oops.interfaces;

public abstract interface Youtuber extends VideoEditor {

	int x = 6;
	
     void makeVideo();
	
    default void uploadVideo() {
    	 System.out.println("Upload the video");
     }
}
