package academy.lgs.exercice_02;

public class Aplication {

	public static void main(String[] args) throws MyExeption {
		
		Methods met = new Methods(2,2);
		

//		met.Devide(); 
//		met.Minus(); 
//		met.Multyply(); 
//		met.Plus();

		
		met.setFirstNumber(0);
		met.setSecondNumber(0);
		
//		met.Devide();
//		met.Minus();
//		met.Multyply();
//		met.Plus();
		
		met.setFirstNumber(-1);
		met.setSecondNumber(-1);
		
//		met.Devide();
//		met.Minus();
//		met.Multyply();
//		met.Plus();
		
		met.setFirstNumber(0);
		met.setSecondNumber(1);
		
		met.Devide();
		met.Minus();
		met.Multyply();
		met.Plus();

	}

}
