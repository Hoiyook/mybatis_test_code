package cn.itheima.mapper.provider;

import cn.itheima.pojo.Student;

public class StudentMapperProvider {
	

    /**
     * 
     * @param entity
     * @return 返回的字符串就是SQL
     */
	public String selectByCondition(Student entity){
		String sql="SELECT * FROM student WHERE 1=1 ";
		 if(entity.getSname()!=null){
			 sql+=" AND SNAME like concat('%',#{sname},'%')";
		 }
		 if(entity.getAge()!=null){
			 sql+=" AND AGE = #{age}";
		 }
		 if(entity.getSex()!=null){
			 sql+=" AND SEX = #{sex} ";
		 }
		 if(entity.getBirthday()!=null){
			 sql+=" AND BIRTHDAY=#{birthday}";
		 }
		
//	      <if test="sname!=null">
//	        AND SNAME like concat('%',#{sname},'%')
//	      </if>
//	      <if test="age!=null">
//	        AND AGE = #{age}
//	      </if>
//	      <if test="sex!=null">
//	        AND SEX = #{sex}     
//	      </if>
//	      <if test="birthday!=null">
//	        AND BIRTHDAY=#{birthday}
//	      </if>
		System.out.println(sql);
		return sql;
	}

}
