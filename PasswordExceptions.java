package exception;

public class PasswordExceptions extends Exception {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PasswordExceptions p = new PasswordExceptions();
		
		
		public void verify (String pwd) throws PasswordExceptions 
		{
			if(pwd.length()<5)
			{
				PasswordExceptions p = new PasswordExceptions();
				throw p;
				
			}
			System.out.println("Strong password");
		}
		public static void main(String[] args) {
			PasswordExceptions p = new PasswordExceptions();
			try {
				p.verify("bgr");
			} catch (PasswordExceptions e) {
				// TODO Auto-generated catch block
				System.out.println("Password too short");
			}
		}
}
