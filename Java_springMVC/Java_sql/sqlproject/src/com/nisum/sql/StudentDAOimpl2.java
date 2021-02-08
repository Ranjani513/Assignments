package com.nisum.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.nisum.sql.DBUtil;
public class StudentDAOimpl2 implements StdentDAO {

	public static Connection  sqlconnection=DBUtil.getDbConnection();

	@Override
	public List<Student> getallstudentdetails() {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		try {
			PreparedStatement ps=sqlconnection.prepareStatement("select * from stu");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(new Student(rs.getInt("id"),rs.getString("name")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public Student addstudent(Student student) {
		// TODO Auto-generated method stub
		
		
		try {
			PreparedStatement ps1=sqlconnection.prepareStatement("insert into stu(id,name)values(?,?)");
			ps1.setInt(1, student.getRollNo());
			ps1.setString(2, student.getName());
			ps1.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Student updatestudent(Student student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps2=sqlconnection.prepareStatement("update stu set name=? where id=?");
			ps2.setInt(2, student.getRollNo());
			ps2.setString(1, student.getName());
			ps2.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public Student deletestudent(Student student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps1=sqlconnection.prepareStatement("delete from stu where id=?");
			ps1.setInt(1, student.getRollNo());
			ps1.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
