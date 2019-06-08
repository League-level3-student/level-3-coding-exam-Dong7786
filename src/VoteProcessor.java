import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int votePope = 0;
		int voteEd = 0;
		for(int i = 0; i < votes.size(); i++) {
			if(votes.get(i).equalsIgnoreCase("Pope Francis")) {
				votePope ++;
				
			}else {
				voteEd++;
				
			}
			
		}
		if(votePope > voteEd) {
			return "pope francis";
			
		}else if(votePope == voteEd) {
			return "TIE";
		}else {
		return "edward snowden";
		}
	}

	

}
