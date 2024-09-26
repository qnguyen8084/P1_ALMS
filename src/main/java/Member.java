public class Member {
    private int memberId;
    private final String name;

    public Member(int memberID, String name) {
        this.memberId = memberID;
        this.name = name;
    }

    public Member(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

}
