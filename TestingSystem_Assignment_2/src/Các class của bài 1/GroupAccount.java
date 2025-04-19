import java.time.LocalDate;

public class GroupAccount {
    private Group groupID;
    private Account accountID;
    private LocalDate joinDate;

    public GroupAccount() {}

    public GroupAccount(Group gorupID, Account accountID, LocalDate joinDate) {
        this.groupID = groupID;
        this.accountID = accountID;
        this.joinDate = joinDate;
    }

    public Group getGroupID() {
        return groupID;
    }

    public void setGroupID(Group groupID) {
        this.groupID = groupID;
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
