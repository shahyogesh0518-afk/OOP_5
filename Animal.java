package workshop_5;

interface animal{
	void eat();
	void walk();
	
}
interface Printable{
	void display();
	
}
class Cow implements animal,Printable{
	public void eat() {
		System.out.println("Cow eats grass");
		
		
	}
    public void walk() {
        System.out.println("Cow walks on 4 legs");
    }

    public void display() {
        System.out.println("This is a Cow");
    }
}
