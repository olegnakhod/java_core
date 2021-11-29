package academy.lgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class MyEntry<K, V> {

	private K objOne;
	private V objTwo;
	private Map<K, V> map = new HashMap();

	public MyEntry() {
		this.map = new HashMap();
	}

	public Map<K, V> getMap() {
		return map;
	}

	public void setMap(Map<K, V> map) {
		this.map = map;
	}

	public K getObjOne() {
		return objOne;
	}

	public void setObjOne(K objOne) {
		this.objOne = objOne;
	}

	public V getObjTwo() {
		return objTwo;
	}

	public void setObjTwo(V objTwo) {
		this.objTwo = objTwo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(map, objOne, objTwo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry other = (MyEntry) obj;
		return Objects.equals(map, other.map) && Objects.equals(objOne, other.objOne)
				&& Objects.equals(objTwo, other.objTwo);
	}

	@Override
	public String toString() {
		return "MyEntry [map=" + map + "]";
	}

	public void addElementForMap(K key, V value) {
		this.map.put(key, value);
	}

	public void removeElementForKey(K key) {
		Iterator<Entry<K, V>> iterator = this.map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getKey().equals(key)) {
				iterator.remove();
			}
		}
	}
	
	public void removeElementForValue(V value) {
		Iterator<Entry<K, V>> iterator = this.map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getValue().equals(value)) {
				iterator.remove();
			}
		}
	}
	
	
	public void outputSetKeyForMap() {
		Iterator<Entry<K, V>> iterator = this.map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			System.out.println(next.getKey());
		}
	}
	
	public void outputListValueForMap() {
		Iterator<Entry<K, V>> iterator = this.map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			System.out.println(next.getValue());
		}
	}
	
	public void outputAllMap() {
		Iterator<Entry<K, V>> iterator = this.map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			System.out.println(next.getKey() + "===> " +next.getValue());
		}
	}

}
