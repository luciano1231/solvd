package main.java.com.solvd.myPool;

import java.sql.Connection;
import java.sql.SQLException;

import main.java.com.solvd.myPool.pool.Validator;



public final class JDBCConnectionValidator 
    implements Validator < Connection >
{
 public boolean isValid(Connection con)
 { 
  if(con == null)
  {
   return false;
  }
  
  try
  {
   return !con.isClosed();
  }
  catch(SQLException se)
  {
   return false;
  }
 }
 
 public void invalidate(Connection con)
 {
  try
  {
   con.close();
  }
  catch(SQLException se)
  {
   
  }
 }
}
