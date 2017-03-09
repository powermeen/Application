package web.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.shared.FileNumberBean;

public class FileNumberRowMapper implements RowMapper<FileNumberBean>{

	@Override
	public FileNumberBean mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		
		FileNumberBean bean = new FileNumberBean();
		
		String fileId = resultSet.getString("fileId");
		String fileNumber = resultSet.getString("fileNumber");
		bean.setFileId(fileId);
		bean.setFileNumber(fileNumber);
		
		return bean;
	}

}
