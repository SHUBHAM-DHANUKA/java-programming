
class Scriptertest{
public void readBashScript() throws Exception {
        try {
        	Runtime rt = Runtime.getRuntime() ;     
            Process p = rt.exec("/home/techie-monk/eclipse-workspace/NetworkLoadBalancer/listing.sh") ; 
            p.destroy() ; 
    } catch(Exception e) 
        {
        /*handle exception*/
           e.printStackTrace();
           throw new Exception("Error " + e.getMessage(), e.getCause());
       }
}
}
public class TestingCode{
	public static void main(String args[]) throws Exception {
		Scriptertest sc = new Scriptertest();
		sc.readBashScript();
		
	}
	
	
}