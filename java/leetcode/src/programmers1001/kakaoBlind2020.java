package programmers1001;

import java.util.ArrayList;

public class kakaoBlind2020 {
	 public int solution(String s) {
        ArrayList<String> list = new ArrayList<>();
		int cnt = 0;
		int answer = 0;
		int n = 0;
		if(s.length()==1) {
			return 1;
		}
        a:
		 for(n = (s.length()/2); n<= 1; n--) {
			 for(int i = 0; i< s.length(); i+=n) {
				 if((i+n)>s.length()) {
					 list.add(s.substring(i,i+n));
				 }
				 else {
					 list.add(s.substring(i,s.length()));
				 }
			 }
			 cnt = 0;
			 for(int i = 0; i< list.size()-1; i++) {
				 if(list.get(0).equals(list.get(1))) {
					 if(list.get(i).length()==list.get(i+1).length()) {
						 if(list.get(i).equals(list.get(i+1))) {
							 cnt++;
						 }
					 }
					 else {
						 answer += list.get(list.size()-1).length();
					 }
				 }
				 else {
					 if(n==1) {
						 return s.length();
					 }
					 else {
						 list.clear();
						 continue a;
					 }
				 }
			 }
			 if (cnt == 0) {
				 return s.length();
			 }
			 else {
				 answer += s.length()-((n-1)+((cnt-1)*n));
				 return answer;
			 }
		 }
		 
		
        return answer;
	 }
}
