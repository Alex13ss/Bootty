package ua.com.bootty.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.bootty.entity.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String topicId);

}
