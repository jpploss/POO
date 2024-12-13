package simulado_q1;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class UserBase {
    private List<User> users = new LinkedList<>();

    public User createUser(String id) {
        User u = new User(id);
        this.users.add(u);
        return u;
    }

    public VerifiedUser createVerifiedUser(String id, Date d) {
        VerifiedUser vu = new VerifiedUser(id, d);
        this.users.add(vu);
        return vu;
    }

    public double tamanhoMedioTweets() {
        int sumTotalTweets = 0;
        int sumTotalTweetsSize = 0;

        for(User u : this.users) {
            sumTotalTweets += u.numTweets();
            sumTotalTweetsSize += u.sumTweetsSizes();
        }

        return sumTotalTweetsSize / (double)sumTotalTweets;
    }

    public double porcentagemVerificados() {
        int numVerifiedUsers = 0;

        for(User u : this.users) {
            if(u instanceof VerifiedUser) numVerifiedUsers++;
        }

        return 100.0 * (numVerifiedUsers / (double)this.users.size());
    }
}
