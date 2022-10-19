

import java.util.ArrayList;
import java.util.List;
import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccsess.HibernateCategoryDao;
import dataAccsess.HibernateCourseDao;
import dataAccsess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
		
		System.out.println("----------- Category ----------");
		
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category(1,"Programlama"));
		categories.add(new Category(2,"Tasarım"));
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		
		try {
			categoryManager.add(new Category(3, "Sistem"));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			categoryManager.add(new Category(4, "Programlama"));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("----------- Course ------------");
		
		List<Course> courses = new ArrayList<>();
		courses.add(new Course(1,"Java","Programlama","Engin Demiroğ",200));
		courses.add(new Course(2,"Php","Programlama","Melih Demirel",150));
		courses.add(new Course(3,"Photoshop","Tasarım","Melih Demirel",150));

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
		
		try {
			courseManager.add(new Course(5, "C++","Programlama","Metin Sezer",-3));
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("------------- Instructor -----------");
		
		Instructor newInstructor = new Instructor(1,"Engin Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(newInstructor);

	}

}