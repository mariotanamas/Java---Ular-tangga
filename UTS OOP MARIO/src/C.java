
public class C extends Player{
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}

	public void setNameC(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

public C(String name, String id,Integer lama,Integer dadu,Integer baru) {
	super(lama,dadu,baru);
	this.name = name;
	this.id = id;
}




}



