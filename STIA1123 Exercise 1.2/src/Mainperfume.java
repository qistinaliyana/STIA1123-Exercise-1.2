
public class Mainperfume {

	public static void main(String[] args) {
		Perfume1 V = new Perfume1();
		Perfume2 YSL = new Perfume2();
		//perfume1
		System.out.println(V.Brand);
		System.out.println(V.Model);
		System.out.println(V.ML);
		System.out.println(V.MadeIn);
		System.out.println(V.Colour);
		
		//Perfume2
		System.out.println(YSL.Brand);
		System.out.println(YSL.Model);
		System.out.println(YSL.ML);
		System.out.println(YSL.MadeIn);
		System.out.println(YSL.Colour);
		
		//Methods
		V.open();
		YSL.open();
		
		V.spray();
		YSL.spray();
		
		V.close();
		YSL.close();	
	}
}
