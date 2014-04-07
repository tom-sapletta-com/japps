package swingFirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnect {

	public static void doConnect()
	{
		try {


            // TODO: put some data from *.ini
			while(resultSet.next()){
				System.out.println(resultSet.getString(1));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
