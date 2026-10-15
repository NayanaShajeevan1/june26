package oops;

public class STudentDetails {
	private String EmailId;
	private String paswrd;
	
	//methods 
	//public void setEmailId(String emailId){
	//this.EmailId=EmailId;
	//}
	//public void setpaswrd(String paswrd){
		//this.paswrd=paswrd; 
		//}

		// TODO Auto-generated method stub
		public void setValues(String EmailId,String paswrd) {
			this.EmailId=EmailId;
			this.paswrd=paswrd;
			
		}
		public String getEmailId() {
			return EmailId;
		}
		public String getpaswrd() {
			return paswrd;

	}

}
