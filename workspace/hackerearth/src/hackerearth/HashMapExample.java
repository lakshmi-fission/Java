package hackerearth;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
public static void main(String args[]){
	HashMap<String,FeedbackItem> hashMap = new HashMap<>();
	FeedbackItem item1 = new FeedbackItem();
	item1.setQuestionId("1");
	item1.setQuestionBody("body1");
	hashMap.put("string1",item1);
	FeedbackItem item2 = new FeedbackItem();
	item1.setQuestionId("2");
	item1.setQuestionBody("body2");
	hashMap.put("string2",item2);
	System.out.println("size=="+hashMap.size());
	for (HashMap.Entry<String, FeedbackItem> entry : hashMap.entrySet()) {
        String key = entry.getKey();
        FeedbackItem value = hashMap.get(key);
        System.out.println("key====="+key);
        value.setAnswerText("answer1");
       }
	}
}
