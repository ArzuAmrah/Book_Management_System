package book;

import java.util.Date;

public class Member extends Person{

    private int membershipNumber;
    private Date membershipDate;

    public Member(String name, int age, String gender, int membershipNumber, Date membershipDate) {
        super(name, age, gender);
        this.membershipNumber = membershipNumber;
        this.membershipDate = membershipDate;
    }

    public int getMembershipNumber() {
        return membershipNumber;
    }

    public Date getMembershipDate() {
        return membershipDate;
    }

}
