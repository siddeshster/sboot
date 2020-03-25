package sbootpack;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<topics> topics = new ArrayList<>(Arrays.asList(
                new topics("spring1", "Name1", "descroption1"),
                new topics("spring2", "Name2", "descroption2"),
                new topics("spring3", "Name3", "descroption3"),
                new topics("spring4", "Name4", "descroption4"),
                new topics("spring", "Name5", "descroption4")
    ));

    public List<topics> getallTopics() {
        return topics;
    }

    public topics getTopic(String id) {
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topics tpc){
        topics.add(tpc);
    }

    public void updateTopic(String id,topics tpc){
        topics.add(tpc);
        for(int i=0; i <topics.size();i++){
            topics t = topics.get(i);

        }

    }
}
