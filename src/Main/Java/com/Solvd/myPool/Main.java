package main.java.com.solvd.myPool;
import java.sql.Connection;

import main.java.com.solvd.myPool.pool.BoundedBlockingPool;
import main.java.com.solvd.myPool.pool.Pool;


public class Main
{
 public static void main(String[] args)
    {
  Pool <Connection> pool = new BoundedBlockingPool<Connection>(10,new JDBCConnectionValidator(),new JDBCConnectionFactory("", "", "", ""));
  
  //do whatever you like
    }
}
