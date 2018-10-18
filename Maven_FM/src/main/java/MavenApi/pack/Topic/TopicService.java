package MavenApi.pack.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics =new ArrayList<>( Arrays.asList(
			new Topic("Spring", "Spring Famework", "Spring Famework Description"),
			new Topic("Java", "Java Famework", "Java Famework Description"),
			new Topic("JavaSpript", "JavaSpript Famework", "JavaSpript Famework Description")
			));

	public List<Topic> GetAllTopics(){
		return topics;
	}
	
	public Topic GetTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addtopic(Topic topic) {
		topics.add(topic);
	}
	
	//	For Update i.e."PUT" request
	public void updatetopic(String id, Topic topic) {
		for(int i=0 ; i < topics.size();i++) {
			Topic t= topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public List<Topic> deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		return topics;
	}
}
