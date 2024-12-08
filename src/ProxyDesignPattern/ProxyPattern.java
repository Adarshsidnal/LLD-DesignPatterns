package ProxyDesignPattern;

interface Image{
	void display();
}


class realImage implements Image{
	
	private String filename;
	
	 public realImage(String filename) {
		 this.filename=filename;
		 loadFromDisk();
	 }
	 
	 public void loadFromDisk() {
		 System.out.println("Loading Image"+" "+filename);
	 }

	@Override
	public void display() {
		  System.out.println("Displaying image: " + filename);
	}
	
}


class proxyImage implements Image{
	private String filename;
	private realImage real;
	
	public proxyImage(String filename) {
		this.filename=filename;
	}
	
	 public void display() {
	        if (real == null) {
	            real = new realImage(filename);
	        }
	        real.display();
	    }
}
public class ProxyPattern {
	 public static void main(String[] args) {
	        Image image = new proxyImage("example.jpg");

	        // Image will be loaded from disk only when display() is called
	        image.display();

	        // Image will not be loaded again, as it has been cached in the Proxy
	        image.display();
	    }
}
