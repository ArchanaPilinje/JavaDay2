
public class Actor {
	private String ActorName;
	private String ActorRoleName;

	public Actor() {

	}

	public Actor(String actorName, String actorRoleName) {

		this.ActorName = actorName;
		this.ActorRoleName = actorRoleName;
	}

	public String getActorName() {
		return ActorName;
	}

	public void setActorName(String actorName) {
		this.ActorName = actorName;
	}

	public String getActorRoleName() {
		return ActorRoleName;
	}

	public void setActorRoleName(String actorRoleName) {
		this.ActorRoleName = actorRoleName;
	}

	public void printActor() {
		System.out.println("Actor Name:" + this.ActorName);
		System.out.println("Actor Role:" + this.ActorRoleName);
	}

}
