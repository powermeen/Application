package web.sql;

public class AssistToolQuery {

	public String getLastFileNumber() {
		String sql = "SELECT i_file_id as fileId , c_file_number  as fileNumber FROM file_number_generate  ORDER BY fileId DESC LIMIT 1";
		return sql;
	}

	public String getAddnewFileNumber() {
		String sql = "INSERT INTO file_number_generate ( c_file_number) VALUES (?) ";
		return sql;
	}

}
