package User;
import Account.Account;
public class User {
    private String name;
    private long password;
    private Account ac;
    public User(String name, Account ac) {
        this.name = name;
        this.ac = ac;
        this.password = 000000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public double withdraw(double value) {
        return ac.get(this, value);
    }

    public void save(double value) {
        ac.put(value);
    }

    public boolean validate() {
        if(getPassword() == 123456) {
            return true;
        } else {
            return false;
        }
    }
}
