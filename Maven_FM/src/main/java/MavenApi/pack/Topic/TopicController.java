package MavenApi.pack.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> GetAllTopics() {
		return topicservice.GetAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic GetTopic(@PathVariable String id) {
		return topicservice.GetTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addtopic(topic);	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void addTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicservice.updatetopic(id,topic);	
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public List<Topic> deleteTopic(@PathVariable String id) {
		 return topicservice.deleteTopic(id);
	}
}
