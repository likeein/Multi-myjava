package ojdbc;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		rows.add(new JdbcTest("������", "kopl4321@naver.com"));
		rows.add(new JdbcTest("ȫ�浿", "hong@naver.cpm"));
		rows.add(new JdbcTest("����ȣ", "park@nate.cpm"));
		
		//row�� ����� ��� ȸ�� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		for(JdbcTest jdbcTest : rows) {
			System.out.println(jdbcTest.getUsername() + "\t" + jdbcTest.getemail());
		}
	}

}
