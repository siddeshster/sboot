package sbootpack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics/")
    public List<topics> getallTopics(){
        return topicService.getallTopics();
    }

    @RequestMapping("/topics/{id}")
    public topics getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics") //@RequestMapping(method =RequestMethod.POST, value = "/topics/")
    public void addTopic(@RequestBody topics tpc){
        topicService.addTopic(tpc);
    }

    @RequestMapping(method =RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody topics tpc,@PathVariable String id){
        topicService.updateTopic(id, tpc);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }

}
