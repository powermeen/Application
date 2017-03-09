package web.dao.server.assist.tool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import web.common.connection.ConnectionFactory;
import web.dao.mapper.FileNumberRowMapper;
import web.shared.FileNumberBean;
import web.sql.AssistToolQuery;

public class AssistToolJDBCTemplate extends ConnectionFactory implements AssistToolDao{

	private JdbcTemplate jdbcTemplate;

	private AssistToolQuery assistToolQuery = new AssistToolQuery();
	
	
	public AssistToolJDBCTemplate() {
		jdbcTemplate = super.getJdbcTemplateFromMySQLConnection();
	}
	
	public String generateFileNumber() {
		String sql = assistToolQuery.getLastFileNumber();
		List<FileNumberBean> beans = new ArrayList<>();
		beans = jdbcTemplate.query(sql, new FileNumberRowMapper());
		String filenumber = "";
		if(!beans.isEmpty()){
			FileNumberBean bean = beans.get(0);
			
			filenumber = bean.getFileNumber();
		}
		return filenumber;
	}

	public void addNewFileNumber(String lastFileNumber) {
		
		String sql = assistToolQuery.getAddnewFileNumber();
		Object[] objects = new Object[1];
		objects[0] = lastFileNumber;
		
		jdbcTemplate.update(sql, objects);
		
	}

}
