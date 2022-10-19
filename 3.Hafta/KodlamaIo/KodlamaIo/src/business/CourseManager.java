package business;

import java.util.List;

import dataAccsess.CourseDao;
import entities.Course;
import logging.Logger;

public class CourseManager {
	
		private CourseDao courseDao;
		private Logger[] loggers;
		private List<Course> courses;
	
		public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
			this.courseDao = courseDao;
			this.loggers = loggers;
			this.courses = courses;
			
		}
		
		public void add(Course course) throws Exception{
			for(Course newCourse:courses) {
				if(course.getCourseName() == newCourse.getCourseName()) {
					throw new Exception("Kurs adı tekrar edemez.");
				}
				
				if(course.getCoursePrice()<0) {
					throw new Exception("Kurs ücreti 0'dan küçük olamaz.");
				}
				
				courseDao.add(course);
				courses.add(course);
				
				for(Logger logger:loggers) {
					logger.log(course.getCourseName());
				}
			}
		}	
	
	}

