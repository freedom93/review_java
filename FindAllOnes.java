import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAllOnes {

	/**
	 * 有一个整数n,写一个函数f(n),返回0到n之间出现"1"的个数。 比如f(13)=6,现在f(1)=1,问下一个最大的f(n)=n的n是什么？
	 */
	private static Integer n = 0;
	private static int totalOne = 0;

	public static void main(String[] args) throws IOException {
//		System.out.println("请输入一个整数：");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		n = Integer.valueOf(br.readLine());
//		for (Integer i = n; i > 0; i--) {
//			totalOne = totalOne + fun(i);
//		}
//		System.out.println("函数f(n)从0到n之间出现的'1'的个数为：" + totalOne);
		System.out.println("下一个最大的f(n)=n的n是：" + funMax());
	}

	public static int fun(Integer n) {
		char[] re = n.toString().toCharArray();
		int le = re.length;
		int num = 0;
		for (int i = 0; i < le; i++) {
			System.out.println("每位数：" + re[i] );
			if (re[i] == '1') {
				num++;
			}
		}
		return num;
	}
	//最笨的方法
	public static int funMax(){
		int n=1;
		int m=0;
		while(true){
			n++;
			m=m+fun(n);
			System.out.println(n+"：" + m );
			if(m==n)
				break;
			
		}
		return n;
	}

}
