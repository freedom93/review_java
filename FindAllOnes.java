import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAllOnes {

	/**
	 * ��һ������n,дһ������f(n),����0��n֮�����"1"�ĸ����� ����f(13)=6,����f(1)=1,����һ������f(n)=n��n��ʲô��
	 */
	private static Integer n = 0;
	private static int totalOne = 0;

	public static void main(String[] args) throws IOException {
//		System.out.println("������һ��������");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		n = Integer.valueOf(br.readLine());
//		for (Integer i = n; i > 0; i--) {
//			totalOne = totalOne + fun(i);
//		}
//		System.out.println("����f(n)��0��n֮����ֵ�'1'�ĸ���Ϊ��" + totalOne);
		System.out.println("��һ������f(n)=n��n�ǣ�" + funMax());
	}

	public static int fun(Integer n) {
		char[] re = n.toString().toCharArray();
		int le = re.length;
		int num = 0;
		for (int i = 0; i < le; i++) {
			System.out.println("ÿλ����" + re[i] );
			if (re[i] == '1') {
				num++;
			}
		}
		return num;
	}
	//��ķ���
	public static int funMax(){
		int n=1;
		int m=0;
		while(true){
			n++;
			m=m+fun(n);
			System.out.println(n+"��" + m );
			if(m==n)
				break;
			
		}
		return n;
	}

}
