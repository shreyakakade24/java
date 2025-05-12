package LibraryManagement;
 public class Member {
    private String name;
    private String memberId;
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public String getName() {
        return name;
    }
    public String getMemberId() {
        return memberId;
    }
    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID  : " + memberId);
    }
 }
