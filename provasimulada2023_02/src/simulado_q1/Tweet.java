package simulado_q1;

public class Tweet {
    String tweet;

    public Tweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTweet() {
        return this.tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public int tweetSize() {
        return this.tweet.length();
    }
}
