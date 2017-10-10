package ua.com.bootty.domain.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.bootty.domain.model.Course;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    List<Course> findByTopicId(String topicId);

}
