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
@Scope("session") //ͬһ���Ự,ʹ��ͬһ������
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	/**
	 * ���յ�����,������POST
	 * @return
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register( Student entity){
	
      System.out.println("-�Ǽ�ѧ����Ϣ-");
      int count=studentService.register(entity);
      System.out.println(count);
	  return "register.jsp";
	}
	
	@RequestMapping(value="excel")
	public void excel(HttpServletResponse response){
		//1.���ѧ������
		List<Student> students = studentService.findAll();
		//2.��ѧ��������д�뵽Excel��
		//1.����һ������,�����ݱ��浽���ص�excel
		HSSFWorkbook book=new HSSFWorkbook();
		//2.����һ��Sheet,�������
		HSSFSheet sheet = book.createSheet();
		
		//����һ����ͷ
		//3.����һ������
		HSSFRow rowHead= sheet.createRow(0);
		rowHead.createCell(0).setCellValue("ѧ����");
		rowHead.createCell(1).setCellValue("�Ա�");
		rowHead.createCell(2).setCellValue("����");
		rowHead.createCell(3).setCellValue("����");
		//�����ݼ��뵽Excel
		for(int i=0;i<students.size();i++){
			//��Ϊ0�Ѿ���Ϊ��ͷ��,���Դ�1��ʼ,ע��,д��Excel�Ǵ�����
			HSSFRow row = sheet.createRow(i+1);
			row.createCell(0).setCellValue(students.get(i).getSname());
			row.createCell(1).setCellValue(students.get(i).getSex());
			row.createCell(2).setCellValue(students.get(i).getBirthday());
			row.createCell(3).setCellValue(students.get(i).getAge());
		}
		
		
		try {
		//3.��Excelд��Response�������--����.
		//���֮ǰ,��������ĸ�ʽ
		response.addHeader("Content-Disposition", "attachment;filename="+new String("ѧ����Ϣ.xlsx".getBytes(),"ISO-8859-1"));
		
			book.write(response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	


}
