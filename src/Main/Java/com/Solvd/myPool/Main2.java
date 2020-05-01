package main.java.com.solvd.myPool;
import java.sql.Connection;

import main.java.com.solvd.myPool.pool.Pool;

public class Main2
{
 public static void main(String[] args)
    {
  Pool <Connection> pool = PoolFactory.newBoundedBlockingPool(10,new JDBCConnectionFactory("", "", "", ""), new JDBCConnectionValidator());
  
  //do whatever you like
  
  Connection poolItem = pool.get();
    }
}

