package com.vti.entity;
import com.vti.backend.ScannerUtils;

import java.time.LocalDate;

public class Group {
    private int groupID;
    private String groupName;
    private Account creatorID;
    private LocalDate createDate;
    private Account[] accounts;

    public Group() {
        System.out.print("Enter groupID: ");
        this.groupID = ScannerUtils.inputInt("Wrong inputting! Please input a number as int, input again.");
        System.out.print("Enter groupName: ");
        this.groupName = ScannerUtils.inputString();
        System.out.println("Enter creatorID: ");
        this.creatorID = new Account();

        this.createDate = LocalDate.now();
        System.out.println("Do you want to add accounts to this group? (1: yes and 2: no)");
        int choice = ScannerUtils.inputInt("Please enter 1 or 2.");
        if (choice == 1) {
            System.out.print("number of account want to add: ");
            int count = ScannerUtils.inputInt("Wrong inputting! Please input a number as int, input again.");
            accounts = new Account[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Enter info for account " + (i + 1));
                accounts[i] = new Account();
            }
        } else {
            accounts = new Account[0];
        }
    }


    public Group(int groupID, String groupName, Account creatorID, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Account creatorID) {
        this.creatorID = creatorID;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }


}
