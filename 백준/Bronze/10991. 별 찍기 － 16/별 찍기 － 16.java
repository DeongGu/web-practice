import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String result = "";
			
			result += " ".repeat(N-1-i);
			result += "*";
			
			for(int j = 0; j < i; j++) {
				
				result+= " ";
				result+= "*";
			}
			
			if(i == N-1) {
				sb.append(result);
			}else {				
				sb.append(result).append("\n");
			}
			
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}