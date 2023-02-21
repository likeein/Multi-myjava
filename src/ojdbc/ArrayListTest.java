package ojdbc;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		rows.add(new JdbcTest("조아인", "kopl4321@naver.com"));
		rows.add(new JdbcTest("홍길동", "hong@naver.cpm"));
		rows.add(new JdbcTest("박찬호", "park@nate.cpm"));
		
		//row에 저장된 모든 회원 정보를 출력하는 코드를 작성하세요.
		for(JdbcTest jdbcTest : rows) {
			System.out.println(jdbcTest.getUsername() + "\t" + jdbcTest.getemail());
		}
	}

}
