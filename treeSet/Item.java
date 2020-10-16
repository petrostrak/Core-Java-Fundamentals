package treeSet;

public class Item implements Comparable<Item> {
	private String description;
	private int partnumber;

	public Item(String description, int partnumber) {
		super();
		this.description = description;
		this.partnumber = partnumber;
	}

	public String getDescription() {
		return this.description;
	}
	

	@Override
	public String toString() {
		return "Item [description=" + description + ", partnumber=" + partnumber + "]";
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + partnumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (partnumber != other.partnumber)
			return false;
		return true;
	}

	@Override
	public int compareTo(Item other) {
		int diff = Integer.compare(this.partnumber, other.partnumber);
		return diff != 0 ? diff : this.description.compareTo(other.description);
	}

}
