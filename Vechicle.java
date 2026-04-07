package workshop_5;

abstract class vechicle{
	abstract void wheel();
	void door() {
	
		System.out.print("vechicle has door");
	}

}
	

class Bus extends vechicle{
	
	@Override
	void wheel() {
		System.out.println("Bus has 6 wheel");
	
}

	@Override
	void door() {
		System.out.println("Bus has 2 doors");
			
}
}