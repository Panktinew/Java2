
class Types_of_food{
	
	
	
	public void love_Punjabi() {
		System.out.println("I love to eat punjabi food");
	}
	public void love_Punjabi(String dish_name) {
		System.out.println("I love to eat punjabi food dish" + dish_name );
	}

}

public class Food1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Types_of_food fd = new Types_of_food();
		
		fd.love_Punjabi();
		fd.love_Punjabi("Paneer masala");

	}

}
