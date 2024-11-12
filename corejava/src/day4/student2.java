package day4;


	public class student2 implements BeACoder {
	    private int sid;
	    private String sname;

	    public int getSid() {
	        return sid;
	    }

	    public void setSid(int sid) {
	        this.sid = sid;
	    }

	    public String getSname() {
	        return sname;
	    }

	    public void setSname(String sname) {
	        this.sname = sname;
	    }

	    @Override
	    public String toString() {
	        return "Student1 [sid=" + sid + ", sname=" + sname + "]";
	    }

	    @Override
	    public void codingPractice() {
	        System.out.println("Hi bala do the practice at " + "wakeuptime");
	    }

		@Override
		public void CodingPractice() {
			// TODO Auto-generated method stub
			
		}
	}

