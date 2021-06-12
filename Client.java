//Atul_Lakhera1018462
import java.io.*;
import java.net.*;

public class Client
  {
       public static void main(String args[])throws Exception
         {
	Socket s=new Socket("localhost",8081);
	
	DataInputStream dataRead=new DataInputStream(s.getInputStream());
	DataOutputStream dataWrite=new DataOutputStream(s.getOutputStream());
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str="",str2="";         //Atul_Lakhera1018462

	while(!str.equals("bye"))
	   {
	       str=br.readLine();
	       dataWrite.writeUTF(str);
	       dataWrite.flush();
	       str2=dataRead.readUTF();
	       System.out.println("server : "+str2);
	    }

 	dataRead.close();
	s.close();
         }
  }