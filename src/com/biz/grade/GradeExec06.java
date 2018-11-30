package com.biz.grade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.grade.vo.StudentVO;

public class GradeExec06 {
	/*
	 * 영어이름들.txt 파일을 읽어서 각 라인을 : 기준으로 자른 후 sVO 리스트에 추가하시오
	 */
	public static void main(String[] args) {
		String nameFile = "src/com/biz/grade/영어 이름들.txt";

		List<StudentVO> sVO = new ArrayList();

		FileReader fr;
		BufferedReader buffer;

		try {
			StudentVO stVO = new StudentVO();
			fr = new FileReader(nameFile);
			buffer = new BufferedReader(fr);
			while (true) {
				String strLine = buffer.readLine();
				if (strLine == null)
					break;
				String[] arrName = strLine.split(":");
				if (arrName.length > 2) {
					stVO.setStrNum(arrName[0]);
					stVO.setStrEngName(arrName[1]);
					stVO.setStrKorName(arrName[2]);
					sVO.add(stVO);
				}
			}
			buffer.close();
			fr.close();
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
