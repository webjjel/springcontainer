package kr.co.saramin.springcontainer;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no;
	private String name;
	private Friend friend;
	private List<String> list;
	private Set<String> set;
	private Map<String, String> map;

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", list=" + list + ", set=" + set + ", map=" + map + "]";
	}	
}
