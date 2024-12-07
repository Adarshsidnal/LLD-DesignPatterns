package FactoryDesignPattern;

abstract class vehicle{
	abstract void printVehicle();
}

class fourWheeler extends vehicle{

	@Override
	void printVehicle() {
		System.out.println("I am the Four Wheeler");
	}
	
}

class twoWheeler extends vehicle{

	@Override
	void printVehicle() {
		System.out.println("I am the two Wheeler");
		
	}
	
}

interface vehicleFactory{
	public vehicle createVehicle();
}

class twoWheelerFactory implements vehicleFactory{

	@Override
	public vehicle createVehicle() {
		
		return new twoWheeler();
	}
	
}

class fourWheelerFactory implements vehicleFactory{

	@Override
	public vehicle createVehicle() {
		
		return new fourWheeler();
	}
	
}


class client{
	private vehicle myvehicle;
	
	public client(vehicleFactory v) {
		this.myvehicle=v.createVehicle();
	}
	
	public vehicle getVehicle() {
		return myvehicle;
	}
}


public class factoryPattern {
	
	public static void main(String[] args) {
		vehicleFactory twoWheelerFactory =new twoWheelerFactory();
		client twoWheelerClient=new client(twoWheelerFactory);
		vehicle myvehicle=twoWheelerClient.getVehicle();	
		myvehicle.printVehicle();
	}

}
