package dataAccsess;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
