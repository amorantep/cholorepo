package db.cholo.vamosjuntos;

public enum DBConstraints {
	
	DB_SERVER("http://118.216.51.127/android_connect/"),
	DB_FILE("");
	
	
	
	
	
	private final String value;
	private DBConstraints(String value) {
		this.value = value;
	}
	public String getvalue() {
		  return value;
    }

}
