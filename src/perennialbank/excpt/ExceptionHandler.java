package perennialbank.excpt;

public class ExceptionHandler {
	Actions a= new Actions();
	public String handleExcp(Exception e)
	
	{ 
		String s=e.getClass().getSimpleName();
		if(s.equals("SQLException"))
		{
			return a.mail();
		}
		else if(s.equals("IOException"))
		{
			
			return a.logs();
		}
		else if(s.equals("FileNotFoundException"))
		{
			return  ""+a.logs()+""+a.mail();
		}
		return "";
	}

}

