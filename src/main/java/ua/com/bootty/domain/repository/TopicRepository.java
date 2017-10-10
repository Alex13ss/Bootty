package ua.com.bootty.domain.repository;

import org.springframework.data.repository.CrudRepository;
import ua.com.bootty.domain.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
