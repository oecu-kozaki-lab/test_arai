
public class test1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String str = "A LONG TIME AGO IN A GALAXY FAR, FAR AWAY . . . .";
		
		System.out.println(str);
		
		int num=0;
		int i=0;
		while(num!=-1) {
			num=str.indexOf("A",num);
			System.out.println(num);
			if(num>=0) {
				num++;
				i++;
			}
			
		}
		System.out.println(i);
	}

}
