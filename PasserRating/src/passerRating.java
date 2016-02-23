import java.util.Scanner;

public class passerRating {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		
		System.out.print("Completions: ");
	    double comp = in.nextDouble();
	    
	    System.out.print("Attempts: ");
	    double att = in.nextDouble();
	    
	    System.out.print("Yards: ");
	    double yds = in.nextDouble();
	    
	    System.out.print("Touch Downs: ");
	    double td = in.nextDouble();
	    
	    System.out.print("Interceptions: ");
	    double inter = in.nextDouble();

	    double a = (comp/att - .3)*5;
	    double b = (yds/att - 3)*.25;
	    double c = (td/att)*20;
	    double d = 2.375 - ((inter/att )*25);
	    
	    double passerRating = ((a + b + c + d)/6) *100;
	    
	    System.out.print("the passer rating is  " +passerRating);
	}

}
