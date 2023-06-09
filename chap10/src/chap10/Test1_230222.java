package chap10;
//DataAccessObject 인터페이스와 OracleDao,MySqlDao 클래스를 구현
interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}
class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
class MySqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Mysql DB에서 삽입");
	}
	@Override
	public void update() {
		System.out.println("Mysql DB에서 수정");
	}
	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");
	}
}
public class Test1_230222 {

	public static void main(String[] args) {

		   dbWork(new OracleDao());

		    dbWork(new MySqlDao());
		
	}
	  private static void dbWork(DataAccessObject dao) {

	         dao.select();

	         dao.insert();

	         dao.update();

	         dao.delete();

	   }
}