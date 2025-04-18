import java.time.LocalDate;

public class GroupAccount {
    private Group gorupID;
    private Account accountID;
    private LocalDate joinDate;

    public GroupAccount() {}

    public GroupAccount(Group gorupID, Account accountID, LocalDate joinDate) {
        this.gorupID = gorupID;
        this.accountID = accountID;
        this.joinDate = joinDate;
    }

    public Group getGorupID() {
        return gorupID;
    }

    public void setGorupID(Group gorupID) {
        this.gorupID = gorupID;
    }

    public Account getAccountID() {
        return accountID;
    }

    public void setAccountID(Account accountID) {
        this.accountID = accountID;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}
