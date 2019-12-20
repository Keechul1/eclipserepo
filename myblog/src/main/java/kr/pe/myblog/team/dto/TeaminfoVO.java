package kr.pe.myblog.team.dto;

public class TeaminfoVO {

	private int team_no;
	private String team_name;
	private String team_position;
	private String team_pic;
	private String regdate;
	private String deldate;
	
	public int getTeam_no() {
		return team_no;
	}
	public void setTeam_no(int team_no) {
		this.team_no = team_no;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getTeam_position() {
		return team_position;
	}
	public void setTeam_position(String team_position) {
		this.team_position = team_position;
	}
	public String getTeam_pic() {
		return team_pic;
	}
	public void setTeam_pic(String team_pic) {
		this.team_pic = team_pic;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getDeldate() {
		return deldate;
	}
	public void setDeldate(String deldate) {
		this.deldate = deldate;
	}
	
}
