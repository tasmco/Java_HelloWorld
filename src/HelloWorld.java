
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 20;
		int total = 0;
		for(int k= 1; k<=m;k++){
			total+=1/factorial(k);
		}
		System.out.println(total);
	}
	public static int factorial(int x){
		int fact = 1;
		for(int i = 1; i<=x;i++){
			fact *=i;
		}
		return fact;
	}
	

}
