package mvc;

public class Controller {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void setName(String name) {
		model.setName(name);
	}
	public void setId(String id) {
		model.setId(id);
	}
	public void setBirth(String birth) {
		model.setBirth(birth);
	}
	public void setYear(String year) {
		model.setYear(year);
	}
	public void setMajor(String major) {
		model.setMajor(major);
	}
	
	public String getName() {
		return model.getName();
	}
	public String getId() {
		return model.getId();
	}
	public String getBirth() {
		return model.getBirth();
	}
	public String getYear() {
		return model.getYear();
	}
	public String getMajor() {
		return model.getMajor();
	}
	
	public void updateView() {
		view.outputStudent(model.getName(), model.getId(), model.getBirth(), model.getYear(), model.getMajor());
	}
	
}
