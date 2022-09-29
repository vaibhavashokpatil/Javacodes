package corejava_eclipse;

public class Phone_Info {

	public static void main(String[] args) {
		
		Phone phone1 = new Phone("Iphone" , 4 , "Green");
		Phone phone2 = new Phone("Realme" , 8 , "Black");
		
		Phone[] Phonearr = new Phone[2];
		Phonearr[0] = phone1;
		Phonearr[1] = phone2;
		
		for(Phone phone : Phonearr)
		{
			System.out.println("Phone Name is: " + phone.Name + " , Ram is: " + phone.Ram + " , Colour is: " + phone.Colour);
		}

	}

}
