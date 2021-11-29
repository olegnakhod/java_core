package academy.lgs;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics<T> {

	private List<T> list;

	ListWithGenerics() {
		this.list = new ArrayList();
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListWithGenerics [list=" + list + "]";
	}
	
	public static ListWithGenerics createListWithGenerics() {
		return new ListWithGenerics(); 
	}
	
	
}
