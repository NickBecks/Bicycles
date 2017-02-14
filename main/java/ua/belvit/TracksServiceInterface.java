package ua.belvit;

public interface TracksServiceInterface {
	
	public void addTrack(String name, double length);
	public void removeTrack(String name);
	public void changeTrack(String name, double length, int rating);
    public void rateTrack(String name, int rating);
}
