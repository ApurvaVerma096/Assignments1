package com.ibm.training.trainings;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class TrainingDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public String getTraining(int id) {
		
		String sql = "select trainingName from training where trainingId = ?";
		
		return  jdbcTemplate.queryForObject(sql, new Object[] {id},String.class);	
	}

	List<Training> getTrainings() {
		String sql = "select * from training";
		return jdbcTemplate.query(sql, new TrainingMapper());

	}
	
	class TrainingMapper implements RowMapper<Training> {

		public Training mapRow(ResultSet rs, int rowNum) throws SQLException {
			Training trng = new Training();
			trng.setAvailableSeats(rs.getInt("AvailableSeats"));
			trng.setTrainingId(rs.getInt("trainingId"));
			trng.setTrainingName(rs.getString("trainingName"));
			return trng;
		}
	}

	public void addTraining(Training trainings) {
		
		String sql = "insert into training values (?,?,?)";
		
		jdbcTemplate.update(sql, new Object[] {
				trainings.getTrainingId(),
				trainings.getTrainingName(),
				trainings.getAvailableSeats()
		});
	}

	public void updateTraining(Training trng, Integer id) {
		
		String sql = "update training set trainingId = ? where trainingName = ?";
		jdbcTemplate.update(sql, new Object[] { trng.getTrainingId(), trng.getTrainingName() });
	}

	public void deleteTraining(Integer id) {

		String sql = "delete from training where trainingId = ?";
		jdbcTemplate.update(sql, new Object[] {id});
		
	}
}
