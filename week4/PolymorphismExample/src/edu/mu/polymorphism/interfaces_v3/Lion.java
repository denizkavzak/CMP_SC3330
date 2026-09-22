package edu.mu.polymorphism.interfaces_v3;

public class Lion extends Animal implements ZooResident{
	
	private String zooName;
	
	public Lion(String name, String zooName) {
		super(name);
		this.zooName = zooName;
	}

	@Override
	public void speak() {
		System.out.println("Roar");
	}
	
    @Override
    public String getInfo() {
        return getName() + " lives at " + zooName;
    }

    @Override
    public String getZooName() {
        return zooName;
    }

    @Override
    public void setZooName(String zooName) {
        this.zooName = zooName;
    }
}
