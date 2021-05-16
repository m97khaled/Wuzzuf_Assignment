import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
public class JobsDataService {
    public  ArrayList<String> FilterJobsByTitle(List<JobDetails> jobs) {
        ArrayList<Integer> pop = new ArrayList<>();
        ArrayList<String> title = new ArrayList<>();
        ArrayList<String> popString = new ArrayList<>();
        for (int i = 0; i < jobs.size(); i++) {
            if (title.contains(jobs.get(i).getTitle())) {
            } else {
                title.add(jobs.get(i).getTitle());
                int n = 0;
                for (int j = 0; j < jobs.size(); j++) {
                    if (jobs.get(i).getTitle().equals(jobs.get(j).getTitle())) {
                        n += 1;
                    }
                }
                pop.add(n);
            }
        }

        Hashtable<String>,Integer>my_dict = new Hashtable<String ,Integer>();
        for (int i =0; i<title.size();i++){
            System.out.println(title.get(i)+" "+pop.get(i));
            my_dict.put(title.get(i),pop.get(i));
        }
        System.out.println(my_dict);

    }
}