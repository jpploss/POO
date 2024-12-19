package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class User {
    private String twitterId;

    private List<Tweet> tweets = new LinkedList<>();

    public User(String id) {
        this.twitterId = id;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void addTweet(Tweet t) {
        this.tweets.add(t);
    }

    public LinkedList<Tweet> getTweets() {
        return new LinkedList<Tweet>(this.tweets); // return a copy
    }

    public int numTweets() {
        return this.tweets.size();
    }

    public int sumTweetsSizes() {
        int sumSizes = 0;
        for(Tweet t : this.tweets) {
            sumSizes += t.tweetSize();
        }
        return sumSizes;
    }

    @Override
    public String toString() {
        return this.twitterId;
    }
}
