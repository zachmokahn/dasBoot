package dasBoot.Requests;

import java.util.Hashtable;

public interface iRequest {
  public String method();
  public String uri();
  public String version();
  public Hashtable<String, String> getBody();
  public int contentLength();
  public String body(String value);
  public String header(String value);
}
