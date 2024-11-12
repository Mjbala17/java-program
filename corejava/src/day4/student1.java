package day4;

public class student1 implements BeACoder {
    private int cid;
    private String cname;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Student2 [cid=" + cid + ", cname=" + cname + "]";
    }

    @Override
    public void codingPractice() {
        System.out.println("Hi bala do the practice at " + "weakuptime");
    }

	@Override
	public void CodingPractice() {
		// TODO Auto-generated method stub
		
	}
}
