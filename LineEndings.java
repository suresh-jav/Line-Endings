import java.io.*;
public class LineEndings{

	public static void main(String... args) throws Exception{
			String filename = args[0];
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			int    i;
			final int EOF;
			i = EOF = -1;

			// Read each character until EOF reached                                
			while ( (i = reader.read()) != EOF ){

			  if (i == '\r'){

			    i = reader.read();
			    
			    if (i == '\n')
			    	System.out.println("[CRLF]");
			    else{
					if(i!=-1)
			    		System.out.print("[CR]"+System.lineSeparator()+(char)i);	
			    	else
			    		System.out.println("[CR]");
			  	}

			  }else if (i == '\n')
			    System.out.println("[LF]");
			  else
			  	System.out.print((char)i);

			}                                        
			reader.close();
	}	
}

