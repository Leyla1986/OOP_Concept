package inheritance.biggertask;

import java.util.ArrayList;

public class Youtube extends Streaming{

    /**
     - video name (String)
     - channel name (String)
     - view count (int)
     - comments (ArrayList of Strings)
     */
       String videoName;
       String channelName;
       int viewCount;
       ArrayList<String> comments = new ArrayList<>();


    public Youtube(String name, String company, double duration, String channelName,int viewCount,
                   ArrayList<String> comments,String videoName) {

        super(name, company, duration);

        this.videoName=videoName;
        this.channelName =channelName;
        this.viewCount = viewCount;
        this.comments=comments;
    }
}
