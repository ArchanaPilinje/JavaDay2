import java.util.Scanner;
public class MovieDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of movies");
		int nM=sc.nextInt();
		Movie[] movies=new Movie[nM];
		for(int i=0;i<nM;i++) {
			Movie m=new Movie();
			System.out.println("Enter the Movie Name and Year of Release of Movie"+(i+1));
			
			m.setMovieName(sc.next());
			m.setYear(sc.next());
			
			System.out.println("Enter the number of Actors in Movie"+(i+1));
			int nA=sc.nextInt();
			Actor a[]=new Actor[nA];
			for(int j=0;j<nA;j++) {
				Actor temp=new Actor();
				System.out.println("Enter the Actor Name and his role in the Movie");
				
				temp.setActorName(sc.next());
				
				temp.setActorRoleName(sc.next());
				
				a[j]=temp;
			}
			m.setActors(a);
			movies[i]=m;
			
		}
		for(Movie m:movies) {
			m.printMovie();
		}

	}

}
