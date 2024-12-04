package ObserverDesignPattern;
import java.util.*;
public class weatherStation implements Subject{
     private List<Observer> list=new ArrayList<Observer>();
     private String weather;
	@Override
	public void addObserver(Observer observer) {
		list.add(observer);
		
	}
	@Override
	public void removeObserver(Observer observer) {
		list.remove(observer);
		
	}
	@Override
	public void notifyOberver() {
		for(int i=0;i<list.size();i++) {
			list.get(i).update(weather);
		}
		
	}
	
	public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyOberver();
    }
     
     
     
}
