package ua.com.bootty.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.bootty.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
