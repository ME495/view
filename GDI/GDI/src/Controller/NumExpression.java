package Controller;

public class NumExpression {
	public int[] interpret(String context){
		System.out.println(context);
		int pos = 0;
		int[] a = new int[6];
		String[] str = context.split(" ");
		for(int i = 1; i < str.length ; i++){
			
			a[i-1] = Integer.valueOf(str[i]);
		}
		return a;
	}
}
