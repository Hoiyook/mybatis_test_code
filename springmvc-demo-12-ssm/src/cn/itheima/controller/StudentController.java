package cn.itheima.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.itheima.entity.Student;
import cn.itheima.service.StudentService;

@Controller
@Scope("session") //同一个会话,使用同一个对象
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * 接收的请求,必须是POST
	 * @return
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register( Student entity){
	
      System.out.println("-登记学生信息-");
      int count=studentService.register(entity);
      System.out.println(count);
	  return "register.jsp";
	}
	
	@RequestMapping(value="excel")
	public void excel(HttpServletResponse response){
		//1.获得学生数据
		List<Student> students = studentService.findAll();
		//2.将学生的数据写入到Excel表
		//1.创建一个数据,将数据保存到本地的excel
		HSSFWorkbook book=new HSSFWorkbook();
		//2.创建一个Sheet,工作表格
		HSSFSheet sheet = book.createSheet();
		
		//构建一个表头
		//3.创建一行数据
		HSSFRow rowHead= sheet.createRow(0);
		rowHead.createCell(0).setCellValue("学生名");
		rowHead.createCell(1).setCellValue("性别");
		rowHead.createCell(2).setCellValue("生日");
		rowHead.createCell(3).setCellValue("年龄");
		//将数据加入到Excel
		for(int i=0;i<students.size();i++){
			//因为0已经作为表头了,所以从1开始,注意,写入Excel是创建列
			HSSFRow row = sheet.createRow(i+1);
			row.createCell(0).setCellValue(students.get(i).getSname());
			row.createCell(1).setCellValue(students.get(i).getSex());
			row.createCell(2).setCellValue(students.get(i).getBirthday());
			row.createCell(3).setCellValue(students.get(i).getAge());
		}
		
		
		try {
		//3.将Excel写到Response的输出流--下载.
		//输出之前,设置输出的格式
		response.addHeader("Content-Disposition", "attachment;filename="+new String("学生信息.xlsx".getBytes(),"ISO-8859-1"));
		
			book.write(response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	


}
