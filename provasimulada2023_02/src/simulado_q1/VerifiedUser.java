package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User{
    Date date;

    public VerifiedUser(String id, Date d) {
        super(id);
        this.date = d;
    }

    public Date getDate() {
        return date;
    }
}
