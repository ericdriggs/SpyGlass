package parallelai.spyglass.hbase;

import org.apache.hadoop.conf.Configuration;

public class HBaseConstants {
  
  public enum SourceMode {
    EMPTY,
    SCAN_ALL,
    SCAN_RANGE,
    GET_LIST;
  }

  public static final String START_KEY = "hbase.%s.startkey";
  public static final String STOP_KEY = "hbase.%s.stopkey"; 
  public static final String SOURCE_MODE = "hbase.%s.source.mode";
  public static final String KEY_LIST = "hbase.%s.key.list";

}