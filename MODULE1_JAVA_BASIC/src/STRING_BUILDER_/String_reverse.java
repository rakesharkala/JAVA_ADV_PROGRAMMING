package STRING_BUILDER_;

public class String_reverse {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("rakesh");
		String rev="";
		for(int i=0;i<=sb.length()/2;i++) {
			int f=i;
			int b=sb.length()-i-1;
			
			char fs=sb.charAt(f);
			char bs=sb.charAt(b);
			
			sb.setCharAt(f, bs);
			sb.setCharAt(b,fs);
			
		}
		System.out.println(sb);
	}

}
