import java.io.*;
import java.util.*;
import javafx.util.Pair;
public class acm {

 
    public static void main(String[] args)
    {
        
      FasterScanner sc=new FasterScanner(System.in);
      int t=sc.nextInt();
      while(t>0){
      HashMap<Integer,Pair> hm=new HashMap<>();
   int n=sc.nextInt();
      for(int i=1;i<=n;i++){
       for(int j=1;j<=n;j++){
          int x=sc.nextInt();
           hm.put(x, new Pair(i,j));
       }
      }
          
      int ans=0;
      for(int i=2;i<=n*n;i++){
          ans+=Math.abs((int)hm.get(i).getKey()-(int)hm.get(i-1).getKey());
          ans+=Math.abs((int)hm.get(i).getValue()-(int)hm.get(i-1).getValue());          
      }
      System.out.println(ans);
          t--;
          }
}
 
}  

class FasterScanner {
	private InputStream mIs;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
 
	public FasterScanner() {
		this(System.in);
	}
 
	public FasterScanner(InputStream is) {
		mIs = is;
	}
 
	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = mIs.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}
 
	public String nextLine() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isEndOfLine(c));
		return res.toString();
	}
 
	public String nextString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}
 
	public long nextLong() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		long res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
 
	public int nextInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}
 
	public boolean isSpaceChar(int c) {
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}
 
	public boolean isEndOfLine(int c) {
		return c == '\n' || c == '\r' || c == -1;
	}
 
} 
